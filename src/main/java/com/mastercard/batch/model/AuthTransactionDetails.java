package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AuthTransactionDetails  implements IFeeder {

	private String prcss_dt;

	private String ime_trace_id;

	private String guide_point_party_id;

	private BigDecimal mti_func_cd;

	private String de48_tran_type_cd;

	private BigDecimal de39_resp_cd;

	private BigDecimal de33_forwarding_ica_id;

	private String acq_contract_sw;

	private String de126_se50_iss_contract_sw;

	private String system_id;

	private String de48_se71_onbehalf_serv_cd;

	private BigDecimal resp_type_cd;

	private String ent_point_cd;

	private String dup_call_sw;

	private String card_type_cd;

	private String de112_se11_tran_id;

	private String pvl_sw;

	private String jcb_sw;

	private String acq_intrfce_cd;

	private String iss_intrfce_cd;

	private String abat_tran_cd;

	private String gia_available_sw;

	private String gia_first_sw;

	private String auth_switch_sw;

	private String feeder_subtype_cd;

	private String source_cd;

	private String de48_se77_paymt_tran_cd;

	private String down_rsn_cd;

	private String sgntr_pin_cd;

	private String de18_merch_type_cd;

	private String cust_prdct_type_cd;

	private String de48_avs_req_cd;

	private String cntrl_acq_cd;

	private String prepaid_cd;

	private String grp_signin_num;

	private String mbr_endpnt_num;

	private String ips_sw;

	private String de60_sf1_adv_rsn_de60_sf1_cd;

	private String de48_se87_cvc_validate_cd;

	private String de126_se32_mce_cvc1_val_cd;

	private String pin_preval_sw;

	private String pin_vldtn_sw;

	private String mchip_magstripe_sw;

	private String aav_sw;

	private String aav_standin_sw;

	private String mchip_cryp_preval_sw;

	private String mchip_standin_sw;

	private String iss_ica_num;

	private String acq_ica_num;

	private String serv_type_acq_cd;

	private String de3_sf1_proc_cd;

	private String de70_ntwk_mgmt_info_cd;

	private String de61_pos_tran_stat_cd;

	private String de22_f2_pos_pan_ent_mode_cd;

	private String de61_pos_card_prsnc_cd;

	private String de48_se83_avs_resp_cd;

	private String de48_se87_crd_valid_cd;

	private String de48_se51_ems_obs_cd;

	private String de48_se61_sf4_merchscore_sw;

	private String merch_ica_num;

	private String usd_amt;

	private String conv_curr_cd;

	private String conv_tran_amt;

	private String acpt_brnd_cd;

	private String dest_id;

	private String pre_auth_cd;

	private String merch_regn_cd;

	private String merch_cntry_cd;

	private String de61_sf11_trml_input_sw;

	private String de126_se15_iccr_serv_cd;

	private String de48_se95_instl_cd;

	private String de61_sf4_cardhldr_prsnc_sw;

	private String on_us_sw;

	private String de61_sf3_pos_trml_loc_cd;

	private String de126_se25_ems_serv_cd;

	private String de112_se09_instl_paymt_cd;

	private String dmstc_src_cd;

	private String b2b_cd;

	private String proof_of_life_sw;

	private String de48se32_mc_assgn_id;

	private String cash_out_pos_cd;

	private String fin_network_cd;

	private String gbs_serv_cd;

	private String on_us_plus_fwd_cd;

	private String iccr_auth_only_cd;

	private String on_us_id;

	private String de112_se21_inst_pymt_data_cd;

	private String de48_se62_ach_cd;

	private String de48_se42_ucaf_sec_cd;

	private String undef_auth_cd;

	private String indonesia_dmstc_cd;

	private String dmstc_tran_type_cd;

	private String de2_card_num;

	private BigDecimal crte_dt;

	private BigDecimal crte_tm;

	private String ref_num;

	private String rsp_by;

	private BigDecimal acq_ica_cust_id;

	private BigDecimal iss_ica_cust_id;

	private BigDecimal loc_curr_amt;

	private BigDecimal loc_curr_cd;

	private String fail_rsn_cd;

	private String full_fail_rsn_cd;

	private String merch_id;

	private String de48_se64_trnst_tran_id;

	private String orig_acq_regn_cd;

	private String orig_acq_cntry_cd;

	private String regn_cntry_chng_sw;

	private String orig_iss_regn_cd;

	private String orig_iss_cntry_cd;

	private String orig_geo_cd;

	private String de48_se61_sf5_final_auth_cd;


	@Override
	public String toCommaSeparatedVariables() {
		return "prcss_dt" +
				",ime_trace_id" +
				",guide_point_party_id" +
				",mti_func_cd" +
				",de48_tran_type_cd" +
				",de39_resp_cd" +
				",de33_forwarding_ica_id" +
				",acq_contract_sw" +
				",de126_se50_iss_contract_sw" +
				",system_id" +
				",de48_se71_onbehalf_serv_cd" +
				",resp_type_cd" +
				",ent_point_cd" +
				",dup_call_sw" +
				",card_type_cd" +
				",de112_se11_tran_id" +
				",pvl_sw" +
				",jcb_sw" +
				",acq_intrfce_cd" +
				",iss_intrfce_cd" +
				",abat_tran_cd" +
				",gia_available_sw" +
				",gia_first_sw" +
				",auth_switch_sw" +
				",feeder_subtype_cd" +
				",source_cd" +
				",de48_se77_paymt_tran_cd" +
				",down_rsn_cd" +
				",sgntr_pin_cd" +
				",de18_merch_type_cd" +
				",cust_prdct_type_cd" +
				",de48_avs_req_cd" +
				",cntrl_acq_cd" +
				",prepaid_cd" +
				",grp_signin_num" +
				",mbr_endpnt_num" +
				",ips_sw" +
				",de60_sf1_adv_rsn_de60_sf1_cd" +
				",de48_se87_cvc_validate_cd" +
				",de126_se32_mce_cvc1_val_cd" +
				",pin_preval_sw" +
				",pin_vldtn_sw" +
				",mchip_magstripe_sw" +
				",aav_sw" +
				",aav_standin_sw" +
				",mchip_cryp_preval_sw" +
				",mchip_standin_sw" +
				",iss_ica_num" +
				",acq_ica_num" +
				",serv_type_acq_cd" +
				",de3_sf1_proc_cd" +
				",de70_ntwk_mgmt_info_cd" +
				",de61_pos_tran_stat_cd" +
				",de22_f2_pos_pan_ent_mode_cd" +
				",de61_pos_card_prsnc_cd" +
				",de48_se83_avs_resp_cd" +
				",de48_se87_crd_valid_cd" +
				",de48_se51_ems_obs_cd" +
				",de48_se61_sf4_merchscore_sw" +
				",merch_ica_num" +
				",usd_amt" +
				",conv_curr_cd" +
				",conv_tran_amt" +
				",acpt_brnd_cd" +
				",dest_id" +
				",pre_auth_cd" +
				",merch_regn_cd" +
				",merch_cntry_cd" +
				",de61_sf11_trml_input_sw" +
				",de126_se15_iccr_serv_cd" +
				",de48_se95_instl_cd" +
				",de61_sf4_cardhldr_prsnc_sw" +
				",on_us_sw" +
				",de61_sf3_pos_trml_loc_cd" +
				",de126_se25_ems_serv_cd" +
				",de112_se09_instl_paymt_cd" +
				",dmstc_src_cd" +
				",b2b_cd" +
				",proof_of_life_sw" +
				",de48se32_mc_assgn_id" +
				",cash_out_pos_cd" +
				",fin_network_cd" +
				",gbs_serv_cd" +
				",on_us_plus_fwd_cd" +
				",iccr_auth_only_cd" +
				",on_us_id" +
				",de112_se21_inst_pymt_data_cd" +
				",de48_se62_ach_cd" +
				",de48_se42_ucaf_sec_cd" +
				",undef_auth_cd" +
				",indonesia_dmstc_cd" +
				",dmstc_tran_type_cd" +
				",de2_card_num" +
				",crte_dt" +
				",crte_tm" +
				",ref_num" +
				",rsp_by" +
				",acq_ica_cust_id" +
				",iss_ica_cust_id" +
				",loc_curr_amt" +
				",loc_curr_cd" +
				",fail_rsn_cd" +
				",full_fail_rsn_cd" +
				",merch_id" +
				",de48_se64_trnst_tran_id" +
				",orig_acq_regn_cd" +
				",orig_acq_cntry_cd" +
				",regn_cntry_chng_sw" +
				",orig_iss_regn_cd" +
				",orig_iss_cntry_cd" +
				",orig_geo_cd" +
				",de48_se61_sf5_final_auth_cd";
	}
}
