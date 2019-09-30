package com.mastercard;

import com.mastercard.exception.FilePathException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@EnableBatchProcessing
public class FeederFileBatchApplication implements CommandLineRunner {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    @Qualifier(value = "sales-data-job")
    Job salesDataJob;

	public static void main(String[] args) {
		SpringApplication.run(FeederFileBatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		long startTime = System.nanoTime();

		String inputFilePath = System.getProperty("input.file.path");

		if(StringUtils.isNotBlank(inputFilePath)){
			JobParameters params = new JobParametersBuilder()
					.addString("JobID", String.valueOf(System.currentTimeMillis()))
					.addString("input.file.path",inputFilePath)
					.addString("fileType", "SALES_RECORDS")
					.toJobParameters();
			jobLauncher.run(salesDataJob, params);
		}else{
			throw new FilePathException("File Path not provided, please provide using -Dinput.file.path");
		}



		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds  : " + timeElapsed);

		System.out.println("Execution time in milliseconds : " +
				timeElapsed / 1000000);


	}

}
