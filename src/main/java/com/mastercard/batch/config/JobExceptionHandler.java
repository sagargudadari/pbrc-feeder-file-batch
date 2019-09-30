package com.mastercard.batch.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.exception.ExceptionHandler;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JobExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(RepeatContext repeatContext, Throwable throwable) throws Throwable {
      log.error(throwable.getMessage());
    }
}
