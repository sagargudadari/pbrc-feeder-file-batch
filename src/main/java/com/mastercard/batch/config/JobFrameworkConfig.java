package com.mastercard.batch.config;

import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class JobFrameworkConfig {

    public TaskExecutor taskExecutor(Integer numberOfThreads) {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor("gcms-transactions-details");
        asyncTaskExecutor.setConcurrencyLimit(numberOfThreads);
        return asyncTaskExecutor;
    }
}