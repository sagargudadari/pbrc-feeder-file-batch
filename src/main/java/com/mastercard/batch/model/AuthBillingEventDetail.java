package com.mastercard.batch.model;

import lombok.Data;

@Data
public class AuthBillingEventDetail implements IFeeder{

	String	prcssDt;
	String	imeTraceId;
	String	summTraceId;
	String	guidePointId;
	String	guidePointPartyId;
	String	billEventId;
	String	qtyNum;
	String	convAmt;
	String	convCurrCd;
	String	ruleSeqNum;
	String	chrgAmt;

	@Override
	public String toCommaSeparatedVariables() {
		return "";
	}
}
