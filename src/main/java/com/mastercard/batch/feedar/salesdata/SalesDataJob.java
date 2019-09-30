package com.mastercard.batch.feedar.salesdata;

import com.mastercard.entity.SalesData;
import com.mastercard.batch.config.JobExceptionHandler;
import com.mastercard.batch.config.JobFrameworkConfig;
import com.mastercard.batch.config.JobResultListener;
import com.mastercard.batch.config.JobSkipperListener;
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
public class SalesDataJob{

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    SalesDataReader salesDataReader;

    @Autowired
    SalesDataWriter salesDataWriter;

    @Value("${sales.data.job.chunk.size}")
    Integer chunkSize;

    @Value("${sales.data.job.thread.count}")
    Integer threadCount;

    @Autowired
    JobFrameworkConfig jobFrameworkConfig;

    @Autowired
    JobSkipperListener jobSkipperListener;

    @Autowired
    JobExceptionHandler jobExceptionHandler;


    @Bean(name = "sales-data-job")
    public Job salesDataJob() {
        Step stepOne = stepBuilderFactory.get("step1").<SalesData, SalesData>chunk(chunkSize)
                .reader(salesDataReader)
                .writer(salesDataWriter)
                .faultTolerant()
                .skipLimit(50)
                .skip(Exception.class)
                .skip(FlatFileParseException.class)
                .skip(IncorrectTokenCountException.class).listener(jobSkipperListener)
                .taskExecutor(jobFrameworkConfig.taskExecutor(threadCount))
                .build();

        Job job = jobBuilderFactory.get("sales-data-job-builder")
                .incrementer(new RunIdIncrementer())
                .listener(new JobResultListener())
                .start(stepOne)
                .build();

        return job;
    }
}
