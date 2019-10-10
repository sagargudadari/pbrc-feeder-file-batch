package com.mastercard.batch.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

@Data
public class GcmsBillingEventDetail {

    private String prcssDt;
    private String imeTraceId;
    private String summTraceId;
    private String guidePointId;
    private String guidePointPartyId;
    private String billEventId;
    private BigDecimal qtyNum;
    private BigDecimal convAmt;
    private String convCurrCd;
    private BigDecimal ruleSeqNum;
    private BigDecimal chrgAmt;

    public String toCommaSeparatedVariables() {
        return "prcssDt" +
                ", imeTraceId" +
                ", summTraceId" +
                ", guidePointId" +
                ", guidePointPartyId" +
                ", billEventId" +
                ", qtyNum" +
                ", convAmt" +
                ", convCurrCd" +
                ", ruleSeqNum" +
                ", chrgAmt";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GcmsBillingEventDetail that = (GcmsBillingEventDetail) o;
        return Objects.equals(imeTraceId, that.imeTraceId) &&
                Objects.equals(guidePointId, that.guidePointId) &&
                Objects.equals(billEventId, that.billEventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imeTraceId, guidePointId, billEventId);
    }
}