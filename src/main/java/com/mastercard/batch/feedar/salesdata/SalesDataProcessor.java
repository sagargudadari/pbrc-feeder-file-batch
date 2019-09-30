package com.mastercard.batch.feedar.salesdata;

import com.mastercard.entity.SalesData;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class SalesDataProcessor implements ItemProcessor<SalesData,SalesData> {

    @Override
    public SalesData process(SalesData salesData) throws Exception {
        return salesData;
    }
}
