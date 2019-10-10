/*
package com.mastercard.batch.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;


@Entity
@Getter
@Setter
@Table(name = "GCMS_TRANSACTION_DETAIL")
public class GcmsTransactionDetail implements Serializable {

    private static final long serialVersionUID = -4148297507931007082L;

    @Id
    @Column(name="PRCSS_DT")
    private String prcssDt;

    @Id
    @Column(name="IME_TRACE_ID")
    private String imeTraceId;

    @Id
    @Column(name="GUIDE_POINT_PARTY_ID")
    private String guidePointPartyId;

    @Column(name="MTI_CD")
    private BigDecimal mtiCd;

    @Column(name="DE24_FUNC_CD")
    private BigDecimal de24FuncCd;

    @Column(name="DE3SF1_CRDHLD_TRAN_TYPE_CD")
    private BigDecimal de3sf1CrdhldTranTypeCd;

    @Column(name="PDS0165SF1_SMI_SW")
    private String pds0165sf1SmiSw;

    @Column(name="PDS0025SF1_MRI_SW")
    private String pds0025sf1MriSw;

    @Column(name="DE26_MCC_CD")
    private BigDecimal de26MccCd;

    @Column(name="PDS0834_EVP_SW")
    private String pds0834EvpSw;

    @Column(name="PVL_SW")
    private String pvlSw;

    @Column(name="PDS0003_LIC_PRDCT_ID")
    private String pds0003LicPrdctId;

    @Column(name="ISS_REGN_CD")
    private BigDecimal issRegnCd;

    @Column(name="ACQ_REGN_CD")
    private BigDecimal acqRegnCd;

    @Column(name="PDS0001SF1_PAYPASS_ACCT_TYP_CD")
    private String pds0001sf1PaypassAcctTypCd;

    @Column(name="TIERED_ICHG_SW")
    private String tieredIchgSw;

    @Column(name="CNTRL_ACQ_SW")
    private String cntrlAcqSw;

    @Column(name="PDS0177SF1_XBRDR_SEND_CD")
    private String pds0177sf1XbrdrSendCd;

    @Column(name="PDS0177SF2_XBRDR_CURR_SEND_CD")
    private String pds0177sf2XbrdrCurrSendCd;

    @Column(name="PDS0177SF1_XBRDR_RECV_CD")
    private String pds0177sf1XbrdrRecvCd;

    @Column(name="PDS0177SF2_XBRDR_CURR_RECV_CD")
    private String pds0177sf2XbrdrCurrRecvCd;

    @Column(name="PDS0071SF2_CHIP_TO_MAG_SW")
    private String pds0071sf2ChipToMagSw;

    @Column(name="PDS0043_PROG_REG_ID")
    private String pds0043ProgRegId;

    @Column(name="PWCB_AMT")
    private BigDecimal pwcbAmt;

    @Column(name="PWCB_SW")
    private String pwcbSw;

    @Column(name="PDS0158SF1_ACPT_BRND_CD")
    private String pds0158sf1AcptBrndCd;

    @Column(name="PDS0158SF10_LATE_PRSNT_CD")
    private String pds0158sf10LatePrsntCd;

    @Column(name="SEND_GBA_NUM")
    private BigDecimal sendGbaNum;

    @Column(name="DE33_FWD_INST_ID")
    private BigDecimal de33FwdInstId;

    @Column(name="DE54_AMT_TYPE_42_EXISTS_SW")
    private String de54AmtType42ExistsSw;

    @Column(name="DE54_AMT_TYPE_58_EXISTS_SW")
    private String de54AmtType58ExistsSw;

    @Column(name="DE25_MRC_NUM")
    private BigDecimal de25MrcNum;

    @Column(name="PDS803SF4_DMSTC_DEBIT_CD")
    private String pds803sf4DmstcDebitCd;

    @Column(name="FEEDER_SUBTYPE_CD")
    private String feederSubtypeCd;

    @Column(name="CUST_PRDCT_TYPE_CD")
    private String custPrdctTypeCd;

    @Column(name="PDS0158SF4_ICHG_RATE_DESIG_CD")
    private String pds0158sf4IchgRateDesigCd;

    @Column(name="PDS0001SF1_ACCT_NUM_TYPE_CD")
    private String pds0001sf1AcctNumTypeCd;

    @Column(name="JPN_DOM_CD")
    private String jpnDomCd;

    @Column(name="PDS0834SF2_CAN_PREM_CD")
    private String pds0834sf2CanPremCd;

    @Column(name="IPS_SW")
    private String ipsSw;

    @Column(name="DE93_TRAN_DEST_INST_ID_CD")
    private BigDecimal de93TranDestInstIdCd;

    @Column(name="DE94_TRAN_ORIG_INST_ID_CD")
    private BigDecimal de94TranOrigInstIdCd;

    @Column(name="DE100_RCV_INST_ID_CD")
    private BigDecimal de100RcvInstIdCd;

    @Column(name="PDS0157_ALT_PRCSSR_CD")
    private String pds0157AltPrcssrCd;

    @Column(name="PDS0158SF12_ALM_CAT_CD")
    private String pds0158sf12AlmCatCd;

    @Column(name="MERCH_GEO_CD")
    private String merchGeoCd;

    @Column(name="DE49_TRAN_CURR_CD")
    private BigDecimal de49TranCurrCd;

    @Column(name="MULTI_SETL_FEE_CD")
    private String multiSetlFeeCd;

    @Column(name="PDS0052SF3_UCAF_COLL_CD")
    private String pds0052sf3UcafCollCd;

    @Column(name="DE22SF5_CARD_PRES_DATA_SW")
    private BigDecimal de22sf5CardPresDataSw;

    @Column(name="DE22SF7_CARD_INPUT_MODE_SW")
    private String de22sf7CardInputModeSw;

    @Column(name="DE43SF6_CARD_ACPT_CNTRY_CD")
    private String de43sf6CardAcptCntryCd;

    @Column(name="PDS0212SF1_SERV_LVL_CD")
    private String pds0212sf1ServLvlCd;

    @Column(name="PDS0212SF2_MC_RESP_CD")
    private String pds0212sf2McRespCd;

    @Column(name="CONV_CURR_CD")
    private String convCurrCd;

    @Column(name="CONV_ACQ_TRAN_AMT")
    private String convAcqTranAmt;

    @Column(name="CONV_ISS_TRAN_AMT")
    private String convIssTranAmt;

    @Column(name="STRM_ID")
    private String strmId;

    @Column(name="RECV_GBA_AMT")
    private String recvGbaAmt;

    @Column(name="PREPAID_CD")
    private String prepaidCd;

    @Column(name="PDS863SF2_ICCR_AMT_SW")
    private String pds863sf2IccrAmtSw;

    @Column(name="DE38_APPR_POS6_CD")
    private String de38ApprPos6Cd;

    @Column(name="PDS0176_MC_ASSGN_ID")
    private String pds0176McAssgnId;

    @Column(name="ON_US_SW")
    private String onUsSw;

    @Column(name="DE22SF4_TRML_OPER_ENV_CD")
    private BigDecimal de22sf4TrmlOperEnvCd;

    @Column(name="ONUS_DE93_DE94_SW")
    private String onusDe93De94Sw;

    @Column(name="PWCB_ACQ_AMT")
    private String pwcbAcqAmt;

    @Column(name="ATM_INTEGRITY_SW")
    private String atmIntegritySw;

    @Column(name="PDS0860_NATL_CURR_SW")
    private String pds0860NatlCurrSw;

    @Column(name="PDS0873_B2B_CD")
    private String pds0873B2bCd;

    @Column(name="PDS0876_CASH_ACS_ONLY_SW")
    private String pds0876CashAcsOnlySw;

    @Column(name="DE04_EQ_54_CD")
    private String de04Eq54Cd;

    @Column(name="DE42_CARD_ACPT_ID_CD")
    private String de42CardAcptIdCd;

    @Column(name="PDS0045_MC_GEN_INSTL_CD")
    private String pds0045McGenInstlCd;

    @Column(name="PDS181S1_POS_INSTL_CD")
    private String pds181s1PosInstlCd;

    @Column(name="PDS182S2_INSTL_NUM")
    private String pds182s2InstlNum;

    @Column(name="PDS0832S9_AUTH_MATCH_CD")
    private String pds0832s9AuthMatchCd;

    @Column(name="PDS0838_SPNDCNTRL_CD")
    private String pds0838SpndcntrlCd;

    @Column(name="PDS0023_TRML_TYPE_CD")
    private String pds0023TrmlTypeCd;

    @Column(name="PDS0005_MSG_ERROR_CD")
    private String pds0005MsgErrorCd;

    @Column(name="PDS0871_GBS_SW")
    private String pds0871GbsSw;

    @Column(name="CO_BRND_ON_US_SW")
    private String coBrndOnUsSw;

    @Column(name="DE22SF6_CARD_PRSNT_DATA")
    private BigDecimal de22sf6CardPrsntData;

    @Column(name="PDS803S5_INSTL_PYMT_SRV_CD")
    private String pds803s5InstlPymtSrvCd;

    @Column(name="PDS0047SF1_TRADE_PAYMT_OPT_CD")
    private String pds0047sf1TradePaymtOptCd;

    @Column(name="ENH_ADVIS_OPT_IN_SW")
    private String enhAdvisOptInSw;

    @Column(name="INT_ICA_PRSNT_CD")
    private String intIcaPrsntCd;

    @Column(name="PDS0165S2_SETL_INFO_TXT")
    private String pds0165s2SetlInfoTxt;

    @Column(name="PDS0158S2_BSA_TYPE_CD")
    private String pds0158s2BsaTypeCd;

    @Column(name="PDS0158SF3_BUSN_SERV_ID_CD")
    private BigDecimal pds0158sf3BusnServIdCd;

    @Column(name="PDS803S6_REG_ECOM_PROG_ISS_CD")
    private String pds803s6RegEcomProgIssCd;

    @Column(name="PDS803S7_REG_ECOM_PROG_ACQ_CD")
    private String pds803s7RegEcomProgAcqCd;

    @Column(name="PDS863SF4_CCM_SW")
    private String pds863sf4CcmSw;

    @Column(name="PDS863SF18_CBCM_SW")
    private String pds863sf18CbcmSw;

    @Column(name="PDS863SF10_CBFM_SW")
    private String pds863sf10CbfmSw;

    @Column(name="MCC_GRP_CD")
    private String mccGrpCd;

    @Column(name="PRDCT_GRP_CD")
    private String prdctGrpCd;

    @Column(name="PDS803S9_NPG_CD")
    private String pds803s9NpgCd;

    @Column(name="INDONESIA_DMSTC_CD")
    private String indonesiaDmstcCd;

    @Column(name="DMSTC_TRAN_TYPE_CD")
    private String dmstcTranTypeCd;

    @Column(name="PDS0141S2_CCR_CD")
    private String pds0141s2CcrCd;

    @Column(name="PDS0803S10_MULTI_CURR_CD")
    private String pds0803s10MultiCurrCd;

    @Column(name="PDS0004S1_FAI_FUND_SRC_CD")
    private BigDecimal pds0004s1FaiFundSrcCd;

    @Column(name="PDS0004SF2_FUND_SEND_ACCT_NUM")
    private String pds0004sf2FundSendAcctNum;

    @Column(name="PDS0014_DIGITAL_ACCT_REF_NUM")
    private String pds0014DigitalAcctRefNum;

    @Column(name="DE2_PRIMARY_ACCT_NUM")
    private String de2PrimaryAcctNum;

    @Column(name="DE4_TRAN_AMT")
    private String de4TranAmt;

    @Column(name="DE31_ACQ_REF_DATA_NUM")
    private BigDecimal de31AcqRefDataNum;

    @Column(name="GUIDED_TRAN_TYPE_CD")
    private String guidedTranTypeCd;

    @Column(name="DE32_ACQ_INST_ID_CD")
    private BigDecimal de32AcqInstIdCd;

    @Column(name="CBWP_SW")
    private String cbwpSw;

    @Column(name="PDS0866_ORIG_ISS_MBR_ID")
    private String pds0866OrigIssMbrId;

    @Column(name="PDS0870_ORIG_ACQ_MBR_ID")
    private String pds0870OrigAcqMbrId;

    @Column(name="DE63SF2_CLR_BNKNT_NUM")
    private String de63sf2ClrBnkntNum;

    @Column(name="PDS0059_TOKEN_ID")
    private String pds0059TokenId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GcmsTransactionDetail that = (GcmsTransactionDetail) o;
        return Objects.equals(imeTraceId, that.imeTraceId) &&
                Objects.equals(prcssDt, that.prcssDt) &&
                Objects.equals(guidePointPartyId, that.guidePointPartyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imeTraceId, prcssDt, guidePointPartyId);
    }
}*/
