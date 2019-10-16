package com.mastercard.batch.listener;


import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class CustomStepListener implements StepExecutionListener {

	@Override
	public void beforeStep(StepExecution stepExecution) {
		//System.out.println("StepExecutionListener - beforeStep");
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		//System.out.println("StepExecutionListener - afterStep");
		return null;
	}

}