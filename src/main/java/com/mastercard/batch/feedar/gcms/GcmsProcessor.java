package com.mastercard.batch.feedar.gcms;

import com.mastercard.entity.GcmsTransactionDetail;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class GcmsProcessor implements ItemProcessor<GcmsTransactionDetail,GcmsTransactionDetail> {

    @Override
    public GcmsTransactionDetail process(GcmsTransactionDetail gcmsTransactionDetail) throws Exception {
        return gcmsTransactionDetail;
    }
}
