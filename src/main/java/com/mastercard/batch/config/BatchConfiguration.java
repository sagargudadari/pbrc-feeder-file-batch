package com.mastercard.batch.config;

import com.mastercard.batch.custom.CustomFlatFileItem;
import com.mastercard.batch.custom.CustomJdbcBatchItemWriter;
import com.mastercard.batch.listener.CustomItemReaderListener;
import com.mastercard.batch.listener.CustomItemWriterListener;
import com.mastercard.batch.listener.JobCompletionNotificationListener;
import com.mastercard.batch.listener.StepListener;
import com.mastercard.batch.model.FeederClassMapper;
import com.mastercard.batch.model.IFeeder;
import com.mastercard.batch.model.TableMetaDataModel;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLIntegrityConstraintViolationException;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    private final JobBuilderFactory jobBuilderFactory;

    private final StepBuilderFactory stepBuilderFactory;

    private final DatabaseMetadata databaseMetadata;

    private final DataSource dataSource;

    private final JobFrameworkConfig jobFrameworkConfig;

    private final StepListener stepListener;

    private final CustomItemReaderListener<Object> customItemReaderListener;

    private final CustomItemWriterListener<Object> customItemWriterListener;

    private TableMetaDataModel tableMetaDataModel;

    @Value("${batch.input.file.path}")
    private String filePath;

    @Value("${batch.input.file.type}")
    private String fileType;

    @Value("${batch.input.file.tableName}")
    private String tableName;

    private Object feeder;

    public BatchConfiguration(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
                              DatabaseMetadata databaseMetadata, DataSource dataSource,
                              JobFrameworkConfig jobFrameworkConfig,
                              StepListener stepListener,
                              CustomItemReaderListener<Object> customItemReaderListener,
                              CustomItemWriterListener<Object> customItemWriterListener) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
        this.databaseMetadata = databaseMetadata;
        this.dataSource = dataSource;
        this.jobFrameworkConfig = jobFrameworkConfig;
        this.stepListener = stepListener;
        this.customItemReaderListener = customItemReaderListener;
        this.customItemWriterListener = customItemWriterListener;
    }

    @SuppressWarnings("unchecked")
    @Bean
    public <T> T reader() {
        feeder = FeederClassMapper.feederClassMap.get(fileType);
        tableMetaDataModel = databaseMetadata.getTableMetaDataModel(tableName, (IFeeder) feeder);
        CustomFlatFileItem<T> customFlatFileItem = new CustomFlatFileItem<>();
        FlatFileItemReader<T> buildFlatFileItemReader = (FlatFileItemReader<T>) customFlatFileItem.buildFlatFileItemReader((T) feeder, tableMetaDataModel, filePath);
        return (T) buildFlatFileItemReader;
    }

    @SuppressWarnings("unchecked")
    @Bean
    public <T> T writer() {
        feeder = FeederClassMapper.feederClassMap.get(fileType);
        CustomJdbcBatchItemWriter<T> customJdbcBatchItemWriter = new CustomJdbcBatchItemWriter<T>();
        JdbcBatchItemWriter<T> buildWriter = (JdbcBatchItemWriter<T>) customJdbcBatchItemWriter.buildWriter((T) feeder, tableMetaDataModel.getBuildQuery(), dataSource);
        return (T) buildWriter;
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener) {
        return jobBuilderFactory.get("feederBatchJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1(feeder))
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
                .listener(customItemReaderListener)
                .listener(customItemWriterListener)
                .listener(stepListener)
                .build();
    }
}