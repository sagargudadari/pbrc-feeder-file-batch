package com.mastercard.batch.model;

import java.util.HashMap;

public class FeederClassMapper {

    public static HashMap<String, Object> feederClassMap = new HashMap<>();

    static {
        feederClassMap.put("GCMSBE", new GcmsBillingEventDetail());
        feederClassMap.put("GCMSBA", new GcmsTransactionDetail());
        feederClassMap.put("CHARGE_DETAIL", new ChargeDetail());
        feederClassMap.put("AUTHBA", new AuthTransactionDetails());
    }


}
