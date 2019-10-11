package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class QmrTransactionDetail {

    private String prcssDt;

    private String imeTraceId;

    private String guidePointPartyId;

    private String qmrId;

    private String cellId;

    private String qtrEndngDt;

    private BigDecimal origRptValAmt;

    private BigDecimal rptValAmt;

    public String toCommaSeparatedVariables() {
        return "prcssDt" +
                ",imeTraceId" +
                ",guidePointPartyId" +
                ",qmrId" +
                ",cellId" +
                ",qtrEndngDt" +
                ",origRptValAmt" +
                ",rptValAmt";
    }
}