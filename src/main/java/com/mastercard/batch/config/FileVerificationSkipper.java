package com.mastercard.batch.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.step.skip.SkipLimitExceededException;
import org.springframework.batch.core.step.skip.SkipPolicy;
import org.springframework.batch.item.file.FlatFileParseException;

import java.io.FileNotFoundException;

@Slf4j
public class FileVerificationSkipper implements SkipPolicy {
    @Override
    public boolean shouldSkip(Throwable throwable, int skipCount) throws SkipLimitExceededException {
        if (throwable instanceof FileNotFoundException) {
            return false;
        } else if (throwable instanceof FlatFileParseException && skipCount <= 5) {
            FlatFileParseException ffpe = (FlatFileParseException) throwable;
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("An error occured while processing the " + ffpe.getLineNumber()
                    + " line of the file. Below was the faulty " + "input.\n");
            errorMessage.append(ffpe.getInput() + "\n");
            log.error("{}", errorMessage.toString());
            return true;
        } else {
            return false;
        }
    }
}
