package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class GcmsTransactionDetail implements IFeeder {

    private Date prcss_dt;

    private String ime_trace_id;

    private String guide_point_party_id;

    private BigDecimal mti_cd;

    private BigDecimal de24_func_cd;

    private BigDecimal de3sf1_crdhld_tran_type_cd;

    private String pds0165sf1_smi_sw;

    private String pds0025sf1_mri_sw;

    private BigDecimal de26_mcc_cd;

    private String pds0834_evp_sw;

    private String pvl_sw;

    private String pds0003_lic_prdct_id;

    private BigDecimal iss_regn_cd;

    private BigDecimal acq_regn_cd;

    private String pds0001sf1_paypass_acct_typ_cd;

    private String tiered_ichg_sw;

    private String cntrl_acq_sw;

    private String pds0177sf1_xbrdr_send_cd;

    private String pds0177sf2_xbrdr_curr_send_cd;

    private String pds0177sf1_xbrdr_recv_cd;

    private String pds0177sf2_xbrdr_curr_recv_cd;

    private String pds0071sf2_chip_to_mag_sw;

    private String pds0043_prog_reg_id;

    private BigDecimal pwcb_amt;

    private String pwcb_sw;

    private String pds0158sf1_acpt_brnd_cd;

    private String pds0158sf10_late_prsnt_cd;

    private BigDecimal send_gba_num;

    private BigDecimal de33_fwd_inst_id;

    private String de54_amt_type_42_exists_sw;

    private String de54_amt_type_58_exists_sw;

    private BigDecimal de25_mrc_num;

    private String pds803sf4_dmstc_debit_cd;

    private String feeder_subtype_cd;

    private String cust_prdct_type_cd;

    private String pds0158sf4_ichg_rate_desig_cd;

    private String pds0001sf1_acct_num_type_cd;

    private String jpn_dom_cd;

    private String pds0834sf2_can_prem_cd;

    private String ips_sw;

    private BigDecimal de93_tran_dest_inst_id_cd;

    private BigDecimal de94_tran_orig_inst_id_cd;

    private BigDecimal de100_rcv_inst_id_cd;

    private String pds0157_alt_prcssr_cd;

    private String pds0158sf12_alm_cat_cd;

    private String merch_geo_cd;

    private BigDecimal de49_tran_curr_cd;

    private String multi_setl_fee_cd;

    private String pds0052sf3_ucaf_coll_cd;

    private BigDecimal de22sf5_card_pres_data_sw;

    private String de22sf7_card_input_mode_sw;

    private String de43sf6_card_acpt_cntry_cd;

    private String pds0212sf1_serv_lvl_cd;

    private String pds0212sf2_mc_resp_cd;

    private String conv_curr_cd;

    private String conv_acq_tran_amt;

    private String conv_iss_tran_amt;

    private String strm_id;

    private String recv_gba_amt;

    private String prepaid_cd;

    private String pds863sf2_iccr_amt_sw;

    private String de38_appr_pos6_cd;

    private String pds0176_mc_assgn_id;

    private String on_us_sw;

    private BigDecimal de22sf4_trml_oper_env_cd;

    private String onus_de93_de94_sw;

    private String pwcb_acq_amt;

    private String atm_integrity_sw;

    private String pds0860_natl_curr_sw;

    private String pds0873_b2b_cd;

    private String pds0876_cash_acs_only_sw;

    private String de04_eq_54_cd;

    private String de42_card_acpt_id_cd;

    private String pds0045_mc_gen_instl_cd;

    private String pds181s1_pos_instl_cd;

    private String pds182s2_instl_num;

    private String pds0832s9_auth_match_cd;

    private String pds0838_spndcntrl_cd;

    private String pds0023_trml_type_cd;

    private String pds0005_msg_error_cd;

    private String pds0871_gbs_sw;

    private String co_brnd_on_us_sw;

    private BigDecimal de22sf6_card_prsnt_data;

    private String pds803s5_instl_pymt_srv_cd;

    private String pds0047sf1_trade_paymt_opt_cd;

    private String enh_advis_opt_in_sw;

    private String int_ica_prsnt_cd;

    private String pds0165s2_setl_info_txt;

    private String pds0158s2_bsa_type_cd;

    private BigDecimal pds0158sf3_busn_serv_id_cd;

    private String pds803s6_reg_ecom_prog_iss_cd;

    private String pds803s7_reg_ecom_prog_acq_cd;

    private String pds863sf4_ccm_sw;

    private String pds863sf18_cbcm_sw;

    private String pds863sf10_cbfm_sw;

    private String mcc_grp_cd;

    private String prdct_grp_cd;

    private String pds803s9_npg_cd;

    private String indonesia_dmstc_cd;

    private String dmstc_tran_type_cd;

    private String pds0141s2_ccr_cd;

    private String pds0803s10_multi_curr_cd;

    private BigDecimal pds0004s1_fai_fund_src_cd;

    private String pds0004sf2_fund_send_acct_num;

    private String pds0014_digital_acct_ref_num;

    private String de2_primary_acct_num;

    private String de4_tran_amt;

    private BigDecimal de31_acq_ref_data_num;

    private String guided_tran_type_cd;

    private BigDecimal de32_acq_inst_id_cd;

    private String cbwp_sw;

    private String pds0866_orig_iss_mbr_id;

    private String pds0870_orig_acq_mbr_id;

    private String de63sf2_clr_bnknt_num;

    private String pds0059_token_id;


    @Override
    public String toCommaSeparatedVariables() {
        return "prcss_dt" +
                ",ime_trace_id" +
                ",guide_point_party_id" +
                ",mti_cd" +
                ",de24_func_cd" +
                ",de3sf1_crdhld_tran_type_cd" +
                ",pds0165sf1_smi_sw" +
                ",pds0025sf1_mri_sw" +
                ",de26_mcc_cd" +
                ",pds0834_evp_sw" +
                ",pvl_sw" +
                ",pds0003_lic_prdct_id" +
                ",iss_regn_cd" +
                ",acq_regn_cd" +
                ",pds0001sf1_paypass_acct_typ_cd" +
                ",tiered_ichg_sw" +
                ",cntrl_acq_sw" +
                ",pds0177sf1_xbrdr_send_cd" +
                ",pds0177sf2_xbrdr_curr_send_cd" +
                ",pds0177sf1_xbrdr_recv_cd" +
                ",pds0177sf2_xbrdr_curr_recv_cd" +
                ",pds0071sf2_chip_to_mag_sw" +
                ",pds0043_prog_reg_id" +
                ",pwcb_amt" +
                ",pwcb_sw" +
                ",pds0158sf1_acpt_brnd_cd" +
                ",pds0158sf10_late_prsnt_cd" +
                ",send_gba_num" +
                ",de33_fwd_inst_id" +
                ",de54_amt_type_42_exists_sw" +
                ",de54_amt_type_58_exists_sw" +
                ",de25_mrc_num" +
                ",pds803sf4_dmstc_debit_cd" +
                ",feeder_subtype_cd" +
                ",cust_prdct_type_cd" +
                ",pds0158sf4_ichg_rate_desig_cd" +
                ",pds0001sf1_acct_num_type_cd" +
                ",jpn_dom_cd" +
                ",pds0834sf2_can_prem_cd" +
                ",ips_sw" +
                ",de93_tran_dest_inst_id_cd" +
                ",de94_tran_orig_inst_id_cd" +
                ",de100_rcv_inst_id_cd" +
                ",pds0157_alt_prcssr_cd" +
                ",pds0158sf12_alm_cat_cd" +
                ",merch_geo_cd" +
                ",de49_tran_curr_cd" +
                ",multi_setl_fee_cd" +
                ",pds0052sf3_ucaf_coll_cd" +
                ",de22sf5_card_pres_data_sw" +
                ",de22sf7_card_input_mode_sw" +
                ",de43sf6_card_acpt_cntry_cd" +
                ",pds0212sf1_serv_lvl_cd" +
                ",pds0212sf2_mc_resp_cd" +
                ",conv_curr_cd" +
                ",conv_acq_tran_amt" +
                ",conv_iss_tran_amt" +
                ",strm_id" +
                ",recv_gba_amt" +
                ",prepaid_cd" +
                ",pds863sf2_iccr_amt_sw" +
                ",de38_appr_pos6_cd" +
                ",pds0176_mc_assgn_id" +
                ",on_us_sw" +
                ",de22sf4_trml_oper_env_cd" +
                ",onus_de93_de94_sw" +
                ",pwcb_acq_amt" +
                ",atm_integrity_sw" +
                ",pds0860_natl_curr_sw" +
                ",pds0873_b2b_cd" +
                ",pds0876_cash_acs_only_sw" +
                ",de04_eq_54_cd" +
                ",de42_card_acpt_id_cd" +
                ",pds0045_mc_gen_instl_cd" +
                ",pds181s1_pos_instl_cd" +
                ",pds182s2_instl_num" +
                ",pds0832s9_auth_match_cd" +
                ",pds0838_spndcntrl_cd" +
                ",pds0023_trml_type_cd" +
                ",pds0005_msg_error_cd" +
                ",pds0871_gbs_sw" +
                ",co_brnd_on_us_sw" +
                ",de22sf6_card_prsnt_data" +
                ",pds803s5_instl_pymt_srv_cd" +
                ",pds0047sf1_trade_paymt_opt_cd" +
                ",enh_advis_opt_in_sw" +
                ",int_ica_prsnt_cd" +
                ",pds0165s2_setl_info_txt" +
                ",pds0158s2_bsa_type_cd" +
                ",pds0158sf3_busn_serv_id_cd" +
                ",pds803s6_reg_ecom_prog_iss_cd" +
                ",pds803s7_reg_ecom_prog_acq_cd" +
                ",pds863sf4_ccm_sw" +
                ",pds863sf18_cbcm_sw" +
                ",pds863sf10_cbfm_sw" +
                ",mcc_grp_cd" +
                ",prdct_grp_cd" +
                ",pds803s9_npg_cd" +
                ",indonesia_dmstc_cd" +
                ",dmstc_tran_type_cd" +
                ",pds0141s2_ccr_cd" +
                ",pds0803s10_multi_curr_cd" +
                ",pds0004s1_fai_fund_src_cd" +
                ",pds0004sf2_fund_send_acct_num" +
                ",pds0014_digital_acct_ref_num" +
                ",de2_primary_acct_num" +
                ",de4_tran_amt" +
                ",de31_acq_ref_data_num" +
                ",guided_tran_type_cd" +
                ",de32_acq_inst_id_cd" +
                ",cbwp_sw" +
                ",pds0866_orig_iss_mbr_id" +
                ",pds0870_orig_acq_mbr_id" +
                ",de63sf2_clr_bnknt_num" +
                ",pds0059_token_id";
    }
}