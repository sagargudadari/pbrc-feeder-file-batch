package com.mastercard.batch.listener;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		log.info("Job Started At : " + jobExecution.getStartTime());
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("BATCH JOB COMPLETED SUCCESSFULLY");
		}
		log.info("Job Completed At : " + jobExecution.getEndTime());
		log.info("Job Exit Status : " + jobExecution.getStatus());
		log.info("Job Detail : {}", jobExecution);

		DateTime dateTimeStart = new DateTime(jobExecution.getStartTime());
		DateTime dateTimeEnd = new DateTime(jobExecution.getEndTime());
		log.info("Job Executed for : " + Hours.hoursBetween(dateTimeStart, dateTimeEnd).getHours() % 24 + " hours, "
				+ Minutes.minutesBetween(dateTimeStart, dateTimeEnd).getMinutes() % 60 + " minutes, "
				+ Seconds.secondsBetween(dateTimeStart, dateTimeEnd).getSeconds() % 60 + " seconds.");

	}
}