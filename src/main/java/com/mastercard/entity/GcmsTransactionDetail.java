package com.mastercard.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="gcms_transaction_detail")
@Getter
@Setter
public class GcmsTransactionDetail implements Serializable {

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IME_TRACE_ID", unique=true, nullable=false, length=46)
	private String imeTraceId;

	@Column(name="ACQ_REGN_CD")
	private int acqRegnCd;

	@Column(name="ATM_INTEGRITY_SW", length=1)
	private String atmIntegritySw;

	@Column(name="CBWP_SW", length=1)
	private String cbwpSw;

	@Column(name="CNTRL_ACQ_SW", length=1)
	private String cntrlAcqSw;

	@Column(name="CO_BRND_ON_US_SW", length=1)
	private String coBrndOnUsSw;

	@Column(name="CONV_ACQ_TRAN_AMT", length=15)
	private String convAcqTranAmt;

	@Column(name="CONV_CURR_CD", length=3)
	private String convCurrCd;

	@Column(name="CONV_ISS_TRAN_AMT", length=15)
	private String convIssTranAmt;

	@Column(name="CUST_PRDCT_TYPE_CD", length=1)
	private String custPrdctTypeCd;

	@Column(name="DE04_EQ_54_CD", length=1)
	private String de04Eq54Cd;

	@Column(name="DE100_RCV_INST_ID_CD")
	private int de100RcvInstIdCd;

	@Column(name="DE2_PRIMARY_ACCT_NUM", length=19)
	private String de2PrimaryAcctNum;

	@Column(name="DE22SF4_TRML_OPER_ENV_CD")
	private int de22sf4TrmlOperEnvCd;

	@Column(name="DE22SF5_CARD_PRES_DATA_SW")
	private int de22sf5CardPresDataSw;

	@Column(name="DE22SF6_CARD_PRSNT_DATA")
	private int de22sf6CardPrsntData;

	@Column(name="DE22SF7_CARD_INPUT_MODE_SW", length=1)
	private String de22sf7CardInputModeSw;

	@Column(name="DE24_FUNC_CD")
	private int de24FuncCd;

	@Column(name="DE25_MRC_NUM")
	private int de25MrcNum;

	@Column(name="DE26_MCC_CD")
	private int de26MccCd;

	@Column(name="DE31_ACQ_REF_DATA_NUM")
	private int de31AcqRefDataNum;

	@Column(name="DE32_ACQ_INST_ID_CD")
	private int de32AcqInstIdCd;

	@Column(name="DE33_FWD_INST_ID")
	private int de33FwdInstId;

	@Column(name="DE38_APPR_POS6_CD", length=1)
	private String de38ApprPos6Cd;

	@Column(name="DE3SF1_CRDHLD_TRAN_TYPE_CD")
	private int de3sf1CrdhldTranTypeCd;

	@Column(name="DE4_TRAN_AMT", length=12)
	private String de4TranAmt;

	@Column(name="DE42_CARD_ACPT_ID_CD", length=15)
	private String de42CardAcptIdCd;

	@Column(name="DE43SF6_CARD_ACPT_CNTRY_CD", length=3)
	private String de43sf6CardAcptCntryCd;

	@Column(name="DE49_TRAN_CURR_CD")
	private int de49TranCurrCd;

	@Column(name="DE54_AMT_TYPE_42_EXISTS_SW", length=1)
	private String de54AmtType42ExistsSw;

	@Column(name="DE54_AMT_TYPE_58_EXISTS_SW", length=1)
	private String de54AmtType58ExistsSw;

	@Column(name="DE63SF2_CLR_BNKNT_NUM", length=6)
	private String de63sf2ClrBnkntNum;

	@Column(name="DE93_TRAN_DEST_INST_ID_CD")
	private int de93TranDestInstIdCd;

	@Column(name="DE94_TRAN_ORIG_INST_ID_CD")
	private int de94TranOrigInstIdCd;

	@Column(name="DMSTC_TRAN_TYPE_CD", length=2)
	private String dmstcTranTypeCd;

	@Column(name="ENH_ADVIS_OPT_IN_SW", length=1)
	private String enhAdvisOptInSw;

	@Column(name="FEEDER_SUBTYPE_CD", length=4)
	private String feederSubtypeCd;

	@Column(name="GUIDED_TRAN_TYPE_CD", length=1)
	private String guidedTranTypeCd;

	@Column(name="INDONESIA_DMSTC_CD", length=1)
	private String indonesiaDmstcCd;

	@Column(name="INT_ICA_PRSNT_CD", length=1)
	private String intIcaPrsntCd;

	@Column(name="IPS_SW", length=1)
	private String ipsSw;

	@Column(name="ISS_REGN_CD")
	private int issRegnCd;

	@Column(name="JPN_DOM_CD", length=1)
	private String jpnDomCd;

	@Column(name="MCC_GRP_CD", length=3)
	private String mccGrpCd;

	@Column(name="MERCH_GEO_CD", length=1)
	private String merchGeoCd;

	@Column(name="MTI_FUNC_CD")
	private int mtiFuncCd;

	@Column(name="MULTI_SETL_FEE_CD", length=1)
	private String multiSetlFeeCd;

	@Column(name="ON_US_SW", length=1)
	private String onUsSw;

	@Column(name="ONUS_DE93_DE94_SW", length=1)
	private String onusDe93De94Sw;

	@Column(name="PDS0001SF1_ACCT_NUM_TYPE_CD", length=2)
	private String pds0001sf1AcctNumTypeCd;

	@Column(name="PDS0001SF1_PAYPASS_ACCT_TYP_CD", length=1)
	private String pds0001sf1PaypassAcctTypCd;

	@Column(name="PDS0003_LIC_PRDCT_ID", length=3)
	private String pds0003LicPrdctId;

	@Column(name="PDS0004S1_FAI_FUND_SRC_CD")
	private int pds0004s1FaiFundSrcCd;

	@Column(name="PDS0004SF2_FUND_SEND_ACCT_NUM", length=34)
	private String pds0004sf2FundSendAcctNum;

	@Column(name="PDS0005_MSG_ERROR_CD", length=4)
	private String pds0005MsgErrorCd;

	@Column(name="PDS0014_DIGITAL_ACCT_REF_NUM", length=19)
	private String pds0014DigitalAcctRefNum;

	@Column(name="PDS0023_TRML_TYPE_CD", length=3)
	private String pds0023TrmlTypeCd;

	@Column(name="PDS0025SF1_MRI_SW", length=1)
	private String pds0025sf1MriSw;

	@Column(name="PDS0043_PROG_REG_ID", length=3)
	private String pds0043ProgRegId;

	@Column(name="PDS0045_MC_GEN_INSTL_CD", length=1)
	private String pds0045McGenInstlCd;

	@Column(name="PDS0047SF1_TRADE_PAYMT_OPT_CD", length=3)
	private String pds0047sf1TradePaymtOptCd;

	@Column(name="PDS0052SF3_UCAF_COLL_CD", length=1)
	private String pds0052sf3UcafCollCd;

	@Column(name="PDS0059_TOKEN_ID", length=11)
	private String pds0059TokenId;

	@Column(name="PDS0071SF2_CHIP_TO_MAG_SW", length=1)
	private String pds0071sf2ChipToMagSw;

	@Column(name="PDS0141S2_CCR_CD", length=1)
	private String pds0141s2CcrCd;

	@Column(name="PDS0157_ALT_PRCSSR_CD", length=4)
	private String pds0157AltPrcssrCd;

	@Column(name="PDS0158S2_BSA_TYPE_CD", length=1)
	private String pds0158s2BsaTypeCd;

	@Column(name="PDS0158SF1_ACPT_BRND_CD", length=3)
	private String pds0158sf1AcptBrndCd;

	@Column(name="PDS0158SF10_LATE_PRSNT_CD", length=1)
	private String pds0158sf10LatePrsntCd;

	@Column(name="PDS0158SF12_ALM_CAT_CD", length=1)
	private String pds0158sf12AlmCatCd;

	@Column(name="PDS0158SF3_BUSN_SERV_ID_CD")
	private int pds0158sf3BusnServIdCd;

	@Column(name="PDS0158SF4_ICHG_RATE_DESIG_CD", length=2)
	private String pds0158sf4IchgRateDesigCd;

	@Column(name="PDS0165S2_SETL_INFO_TXT", length=29)
	private String pds0165s2SetlInfoTxt;

	@Column(name="PDS0165SF1_SMI_SW", length=1)
	private String pds0165sf1SmiSw;

	@Column(name="PDS0176_MC_ASSGN_ID", length=6)
	private String pds0176McAssgnId;

	@Column(name="PDS0177SF1_XBRDR_RECV_CD", length=1)
	private String pds0177sf1XbrdrRecvCd;

	@Column(name="PDS0177SF1_XBRDR_SEND_CD", length=1)
	private String pds0177sf1XbrdrSendCd;

	@Column(name="PDS0177SF2_XBRDR_CURR_RECV_CD", length=1)
	private String pds0177sf2XbrdrCurrRecvCd;

	@Column(name="PDS0177SF2_XBRDR_CURR_SEND_CD", length=1)
	private String pds0177sf2XbrdrCurrSendCd;

	@Column(name="PDS0212SF1_SERV_LVL_CD", length=3)
	private String pds0212sf1ServLvlCd;

	@Column(name="PDS0212SF2_MC_RESP_CD", length=2)
	private String pds0212sf2McRespCd;

	@Column(name="PDS0803S10_MULTI_CURR_CD", length=1)
	private String pds0803s10MultiCurrCd;

	@Column(name="PDS0832S9_AUTH_MATCH_CD", length=1)
	private String pds0832s9AuthMatchCd;

	@Column(name="PDS0834_EVP_SW", length=1)
	private String pds0834EvpSw;

	@Column(name="PDS0834SF2_CAN_PREM_CD", length=1)
	private String pds0834sf2CanPremCd;

	@Column(name="PDS0838_SPNDCNTRL_CD", length=1)
	private String pds0838SpndcntrlCd;

	@Column(name="PDS0860_NATL_CURR_SW", length=1)
	private String pds0860NatlCurrSw;

	@Column(name="PDS0866_ORIG_ISS_MBR_ID", length=11)
	private String pds0866OrigIssMbrId;

	@Column(name="PDS0870_ORIG_ACQ_MBR_ID", length=11)
	private String pds0870OrigAcqMbrId;

	@Column(name="PDS0871_GBS_SW", length=1)
	private String pds0871GbsSw;

	@Column(name="PDS0873_B2B_CD", length=1)
	private String pds0873B2bCd;

	@Column(name="PDS0876_CASH_ACS_ONLY_SW", length=1)
	private String pds0876CashAcsOnlySw;

	@Column(name="PDS181S1_POS_INSTL_CD", length=2)
	private String pds181s1PosInstlCd;

	@Column(name="PDS182S2_INSTL_NUM", length=2)
	private String pds182s2InstlNum;

	@Column(name="PDS803S5_INSTL_PYMT_SRV_CD", length=1)
	private String pds803s5InstlPymtSrvCd;

	@Column(name="PDS803S6_REG_ECOM_PROG_ISS_CD", length=1)
	private String pds803s6RegEcomProgIssCd;

	@Column(name="PDS803S7_REG_ECOM_PROG_ACQ_CD", length=1)
	private String pds803s7RegEcomProgAcqCd;

	@Column(name="PDS803S9_NPG_CD", length=1)
	private String pds803s9NpgCd;

	@Column(name="PDS803SF4_DMSTC_DEBIT_CD", length=1)
	private String pds803sf4DmstcDebitCd;

	@Column(name="PDS863SF10_CBFM_SW", length=1)
	private String pds863sf10CbfmSw;

	@Column(name="PDS863SF18_CBCM_SW", length=1)
	private String pds863sf18CbcmSw;

	@Column(name="PDS863SF2_ICCR_AMT_SW", length=1)
	private String pds863sf2IccrAmtSw;

	@Column(name="PDS863SF4_CCM_SW", length=1)
	private String pds863sf4CcmSw;

	@Column(name="PRDCT_GRP_CD", length=3)
	private String prdctGrpCd;

	@Column(name="PREPAID_CD", length=1)
	private String prepaidCd;

	@Column(name="PVL_SW", length=1)
	private String pvlSw;

	@Column(name="PWCB_ACQ_AMT", length=12)
	private String pwcbAcqAmt;

	@Column(name="PWCB_AMT")
	private int pwcbAmt;

	@Column(name="PWCB_SW", length=1)
	private String pwcbSw;

	@Column(name="RECV_GBA_AMT", length=12)
	private String recvGbaAmt;

	@Column(name="SEND_GBA_NUM")
	private int sendGbaNum;

	@Column(name="STRM_ID", length=13)
	private String strmId;

	@Column(name="TIERED_ICHG_SW", length=1)
	private String tieredIchgSw;

}