package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ChargeDetail implements IFeeder {

	private String summ_trace_id;

	private Date chrg_dt;

	private String inv_num;

	private String inv_ica;

	private String activity_ica;

	private String from_cntry_cd;

	private String to_cntry_cd;

	private BigDecimal geo_cd;

	private String prdct_id;

	private String event_src_nam;

	private String bill_event_id;

	private String bill_event_desc ;

	private String serv_cd;

	private String tier_event_id;

	private String cllct_mthd_cd;

	private BigDecimal qty_num;

	private BigDecimal tran_amt;

	private BigDecimal chrg_amt_loc;

	private String curr_cd;

	private BigDecimal chrg_amt_usd;

	@Override
	public String toCommaSeparatedVariables() {
		return "summ_trace_id" +
				",chrg_dt" +
				",inv_num" +
				",inv_ica" +
				",activity_ica" +
				",from_cntry_cd" +
				",to_cntry_cd" +
				",geo_cd" +
				",prdct_id" +
				",event_src_nam" +
				",bill_event_id" +
				",bill_event_desc " +
				",serv_cd" +
				",tier_event_id" +
				",cllct_mthd_cd" +
				",qty_num" +
				",tran_amt" +
				",chrg_amt_loc" +
				",curr_cd" +
				",chrg_amt_usd";
	}
}
