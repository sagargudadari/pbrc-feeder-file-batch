package com.mastercard.batch.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class JobRunningStatus {

    public static String RUNNING = "running";

    public static String NOT_RUNNING = "not-running";

    public static String currentStatus;

    JobRunningStatus(){
        currentStatus = NOT_RUNNING;
    }
}
