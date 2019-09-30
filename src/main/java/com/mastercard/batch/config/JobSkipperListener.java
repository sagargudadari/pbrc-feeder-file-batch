package com.mastercard.batch.config;

import com.mastercard.entity.SalesData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.SkipListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JobSkipperListener implements SkipListener<SalesData,SalesData> {

    @Override
    public void onSkipInRead(Throwable throwable) {
        log.error(throwable.getMessage());
    }

    @Override
    public void onSkipInWrite(SalesData salesData, Throwable throwable) {

    }

    @Override
    public void onSkipInProcess(SalesData salesData, Throwable throwable) {

    }
}
