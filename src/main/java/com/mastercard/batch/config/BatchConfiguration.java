package com.mastercard.batch.config;

import com.mastercard.batch.custom.CustomFlatFileItem;
import com.mastercard.batch.custom.CustomJdbcBatchItemWriter;
import com.mastercard.batch.listener.JobCompletionNotificationListener;
import com.mastercard.batch.listener.StepListener;
import com.mastercard.batch.model.GcmsBillingEventDetail;
import com.mastercard.batch.model.TableMetaDataModel;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLIntegrityConstraintViolationException;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DatabaseMetadata databaseMetadata;

    @Autowired
    public DataSource dataSource;

    @Autowired
    JobFrameworkConfig jobFrameworkConfig;

    @Autowired
    StepListener stepListener;

    private TableMetaDataModel tableMetaDataModel;

    GcmsBillingEventDetail gcmsBillingEventDetail = new GcmsBillingEventDetail();
    //GcmsTransactionDetail gcmsBillingEventDetail = new GcmsTransactionDetail();

    @SuppressWarnings("unchecked")
    @Bean
    public <T> T reader() {
        tableMetaDataModel = databaseMetadata.getTableMetaDataModel("GCMS_BILLING_EVENT_DETAIL");
        CustomFlatFileItem<T> customFlatFileItem = new CustomFlatFileItem<>();
        FlatFileItemReader<T> buildFlatFileItemReader = (FlatFileItemReader<T>) customFlatFileItem.buildFlatFileItemReader((T) gcmsBillingEventDetail, tableMetaDataModel);
        return (T) buildFlatFileItemReader;
    }

    @SuppressWarnings("unchecked")
    @Bean
    public <T> T writer() {
        CustomJdbcBatchItemWriter<T> customJdbcBatchItemWriter = new CustomJdbcBatchItemWriter<T>();
        JdbcBatchItemWriter<T> buildWriter = (JdbcBatchItemWriter<T>) customJdbcBatchItemWriter.buildWriter((T) gcmsBillingEventDetail, tableMetaDataModel.getBuildQuery(), dataSource);
        return (T) buildWriter;
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1(gcmsBillingEventDetail))
                .end()
                .build();
    }

    @Bean
    public <T> Step step1(T feeders) {
        return stepBuilderFactory.get("step1")
                .<T, T>chunk(3000)
                .reader(reader())
                .writer(writer())
                .faultTolerant()
                .skip(SQLIntegrityConstraintViolationException.class)
                .taskExecutor(jobFrameworkConfig.taskExecutor(3))
                .listener(stepListener)
                .build();
    }
}