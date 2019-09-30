package com.mastercard.batch.feedar.gcms;

import com.mastercard.batch.config.JobExceptionHandler;
import com.mastercard.batch.config.JobFrameworkConfig;
import com.mastercard.batch.config.JobResultListener;
import com.mastercard.batch.config.JobSkipperListener;
import com.mastercard.entity.GcmsTransactionDetail;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.batch.item.file.transform.IncorrectTokenCountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class GcmsJob{

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    GcmsReader gcmsReader;

    @Autowired
    GcmsWriter gcmsWriter;

    @Autowired
    JobFrameworkConfig jobFrameworkConfig;

    @Autowired
    JobSkipperListener jobSkipperListener;

    @Autowired
    JobExceptionHandler jobExceptionHandler;

    @Value("${gcms.transactions.details.job.chunk.size}")
    Integer chunkSize;

    @Value("${gcms.transactions.details.job.thread.count}")
    Integer threadCount;

    @Bean(name = "gcms-transactions-details-job")
    public Job gcmsTrasactionDetailsJob() {
        Step stepOne = stepBuilderFactory.get("gcms-transactions-details-data-load-step").<GcmsTransactionDetail, GcmsTransactionDetail>chunk(chunkSize)
                .reader(gcmsReader)
                .writer(gcmsWriter)
                .faultTolerant()
                .skipLimit(50)
                .skip(Exception.class)
                .skip(FlatFileParseException.class)
                .skip(IncorrectTokenCountException.class).listener(jobSkipperListener).exceptionHandler(jobExceptionHandler)
                .taskExecutor(jobFrameworkConfig.taskExecutor(threadCount))
                .build();

        Job job = jobBuilderFactory.get("gcms-transactions-details-job-builder")
                .incrementer(new RunIdIncrementer())
                .listener(new JobResultListener())
                .start(stepOne)
                .build();

        return job;
    }

}
