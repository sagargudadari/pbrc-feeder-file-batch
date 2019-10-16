package com.mastercard.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StepListener implements StepExecutionListener {
    @Override
    public void beforeStep(StepExecution stepExecution) {

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("Total Records Read from file: " + stepExecution.getReadCount());

        ///log.info("Total Records Skipped due to error: " + stepExecution.getSkipCount());

        int write = stepExecution.getReadCount() - stepExecution.getSkipCount();
        log.info("Total Records Write to Database : " + write);
        return null;
    }
}