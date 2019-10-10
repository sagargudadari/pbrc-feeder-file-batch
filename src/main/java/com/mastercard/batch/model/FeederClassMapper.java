package com.mastercard.batch.model;

import java.util.HashMap;

public class FeederClassMapper {

    public static HashMap<String, Object> feederClassMap = new HashMap<>();

    static {
        feederClassMap.put("gcmsBillingEventDetail", new GcmsBillingEventDetail());
    }


}
