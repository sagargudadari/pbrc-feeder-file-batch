package com.mastercard.batch.model;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;


@Data
public class GcmsTransactionDetail implements Serializable {

    private String prcssDt;
    private String imeTraceId;
    private String guidePointPartyId;
    private BigDecimal mtiCd;
    private BigDecimal de24FuncCd;
    private BigDecimal de3sf1CrdhldTranTypeCd;
    private String pds0165sf1SmiSw;
    private String pds0025sf1MriSw;
    private BigDecimal de26MccCd;
    private String pds0834EvpSw;
    private String pvlSw;
    private String pds0003LicPrdctId;
    private BigDecimal issRegnCd;
    private BigDecimal acqRegnCd;
    private String pds0001sf1PaypassAcctTypCd;
    private String tieredIchgSw;
    private String cntrlAcqSw;
    private String pds0177sf1XbrdrSendCd;
    private String pds0177sf2XbrdrCurrSendCd;
    private String pds0177sf1XbrdrRecvCd;
    private String pds0177sf2XbrdrCurrRecvCd;
    private String pds0071sf2ChipToMagSw;
    private String pds0043ProgRegId;
    private BigDecimal pwcbAmt;
    private String pwcbSw;
    private String pds0158sf1AcptBrndCd;
    private String pds0158sf10LatePrsntCd;
    private BigDecimal sendGbaNum;
    private BigDecimal de33FwdInstId;
    private String de54AmtType42ExistsSw;
    private String de54AmtType58ExistsSw;
    private BigDecimal de25MrcNum;
    private String pds803sf4DmstcDebitCd;
    private String feederSubtypeCd;
    private String custPrdctTypeCd;
    private String pds0158sf4IchgRateDesigCd;
    private String pds0001sf1AcctNumTypeCd;
    private String jpnDomCd;
    private String pds0834sf2CanPremCd;
    private String ipsSw;
    private BigDecimal de93TranDestInstIdCd;
    private BigDecimal de94TranOrigInstIdCd;
    private BigDecimal de100RcvInstIdCd;
    private String pds0157AltPrcssrCd;
    private String pds0158sf12AlmCatCd;
    private String merchGeoCd;
    private BigDecimal de49TranCurrCd;
    private String multiSetlFeeCd;
    private String pds0052sf3UcafCollCd;
    private BigDecimal de22sf5CardPresDataSw;
    private String de22sf7CardInputModeSw;
    private String de43sf6CardAcptCntryCd;
    private String pds0212sf1ServLvlCd;
    private String pds0212sf2McRespCd;
    private String convCurrCd;
    private String convAcqTranAmt;
    private String convIssTranAmt;
    private String strmId;
    private String recvGbaAmt;
    private String prepaidCd;
    private String pds863sf2IccrAmtSw;
    private String de38ApprPos6Cd;
    private String pds0176McAssgnId;
    private String onUsSw;

    private BigDecimal de22sf4TrmlOperEnvCd;

    private String onusDe93De94Sw;

    private String pwcbAcqAmt;

    private String atmIntegritySw;

    private String pds0860NatlCurrSw;

    private String pds0873B2bCd;

    private String pds0876CashAcsOnlySw;

    private String de04Eq54Cd;

    private String de42CardAcptIdCd;

    private String pds0045McGenInstlCd;

    private String pds181s1PosInstlCd;

    private String pds182s2InstlNum;

    private String pds0832s9AuthMatchCd;

    private String pds0838SpndcntrlCd;

    private String pds0023TrmlTypeCd;

    private String pds0005MsgErrorCd;

    private String pds0871GbsSw;

    private String coBrndOnUsSw;

    private BigDecimal de22sf6CardPrsntData;

    @Column(name = "PDS803S5_INSTL_PYMT_SRV_CD")
    private String pds803s5InstlPymtSrvCd;

    private String pds0047sf1TradePaymtOptCd;

    private String enhAdvisOptInSw;

    private String intIcaPrsntCd;

    private String pds0165s2SetlInfoTxt;

    private String pds0158s2BsaTypeCd;

    private BigDecimal pds0158sf3BusnServIdCd;

    private String pds803s6RegEcomProgIssCd;

    private String pds803s7RegEcomProgAcqCd;

    private String pds863sf4CcmSw;

    private String pds863sf18CbcmSw;

    private String pds863sf10CbfmSw;

    private String mccGrpCd;

    private String prdctGrpCd;

    private String pds803s9NpgCd;

    private String indonesiaDmstcCd;

    private String dmstcTranTypeCd;

    private String pds0141s2CcrCd;

    private String pds0803s10MultiCurrCd;

    private BigDecimal pds0004s1FaiFundSrcCd;

    private String pds0004sf2FundSendAcctNum;

    private String pds0014DigitalAcctRefNum;

    private String de2PrimaryAcctNum;

    private String de4TranAmt;

    private BigDecimal de31AcqRefDataNum;

    private String guidedTranTypeCd;

    private BigDecimal de32AcqInstIdCd;

    private String cbwpSw;

    private String pds0866OrigIssMbrId;

    private String pds0870OrigAcqMbrId;

    private String de63sf2ClrBnkntNum;

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
}