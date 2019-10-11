package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ChargeDetail {

    private String summTraceId;

    private BigDecimal chrgDt;

    private String invNum;

    private String invIca;

    private String activityIca;

    private String fromCntryCd;

    private String toCntryCd;

    private BigDecimal geoCd;

    private String prdctId;

    private String eventSrcNam;

    private String billEventId;

    private String servCd;

    private String tierEventId;

    private String cllctMthdCd;

    private BigDecimal qtyNum;

    private BigDecimal tranAmt;

    private BigDecimal chrgAmtLoc;

    private String currCd;

    private BigDecimal chrgAmtUsd;

    public String toCommaSeparatedVariables() {
        return "summTraceId" +
                ",chrgDt" +
                ",invNum" +
                ",invIca" +
                ",activityIca" +
                ",fromCntryCd" +
                ",toCntryCd" +
                ",geoCd" +
                ",prdctId" +
                ",eventSrcNam" +
                ",billEventId" +
                ",servCd" +
                ",tierEventId" +
                ",cllctMthdCd" +
                ",qtyNum" +
                ",tranAmt" +
                ",chrgAmtLoc" +
                ",currCd" +
                ",chrgAmtUsd";
    }
}