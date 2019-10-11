/*
package com.mastercard.batch.service;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mastercard.batch.config.BatchConfiguration;
import com.mastercard.batch.listener.JobCompletionNotificationListener;
import com.mastercard.batch.listener.StepListener;
import com.mastercard.batch.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
@EnableBatchProcessing
@EnableScheduling
//@Import({BatchScheduler.class})
public class BatchExecutorService {

    */
/*@Autowired
    RestTemplate restTemplate ;*//*
*/
/*

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;

   *//*

    @Autowired
    BatchConfiguration batchConfiguration;

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    JobLauncher jobLauncher;



    @Autowired
    StepListener stepListener;

    @Autowired
    JobCompletionNotificationListener listener;


    @Scheduled(fixedRate = 10000000)
    public void execute() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

        log.info("we are here .. ");
        FeederAuditModel feederAuditModel = new FeederAuditModel();
        feederAuditModel.setTableName("GCMS_BILLING_EVENT_DETAIL");
        IFeeder feederObject = FeederClassMapper.feederClassMap.get(feederAuditModel.getTableName());
        List<String> columnsList = Lists.newArrayList(Splitter.on(",").split(feederObject.toCommaSeparatedVariables()));

        */
/*batchConfiguration.setDatabaseMetadata(new DatabaseMetadata(feederAuditModel.getTableName(), columnsList));
        batchConfiguration.setFeederObject(feederObject);*//*

        */
/*BatchConfiguration batchConfiguration = new BatchConfiguration(feederObject,
                new DatabaseMetadata(feederAuditModel.getTableName(), columnsList));
*//*

       */
/* JobParameters params = new JobParametersBuilder()
                .addString("JobID", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();*//*


        //jobLauncher.run(job, params);
        batchConfiguration.setDatabaseMetadata(new DatabaseMetadata(feederAuditModel.getTableName(), columnsList));
        batchConfiguration.setFeederObject(new GcmsBillingEventDetail());
        batchConfiguration.setStepBuilderFactory(stepBuilderFactory);
        batchConfiguration.setJobBuilderFactory(jobBuilderFactory);
        batchConfiguration.setStepListener(stepListener);

        System.out.println(" Job Started at :"+ new Date());
        JobParameters param = new JobParametersBuilder().addString("JobID",
                String.valueOf(System.currentTimeMillis())).toJobParameters();
        JobExecution execution = jobLauncher.run(batchConfiguration.importUserJob(listener), param);
        System.out.println("Job finished with status :" + execution.getStatus());

    }
}
*/
