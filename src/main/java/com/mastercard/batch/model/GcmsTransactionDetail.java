package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GcmsTransactionDetail {

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

    public String toCommaSeparatedVariables() {
        return  "prcssDt" +
                ",imeTraceId" +
                ",guidePointPartyId" +
                ",mtiCd" +
                ",de24FuncCd" +
                ",de3sf1CrdhldTranTypeCd" +
                ",pds0165sf1SmiSw" +
                ",pds0025sf1MriSw" +
                ",de26MccCd" +
                ",pds0834EvpSw" +
                ",pvlSw" +
                ",pds0003LicPrdctId" +
                ",issRegnCd" +
                ",acqRegnCd" +
                ",pds0001sf1PaypassAcctTypCd" +
                ",tieredIchgSw" +
                ",cntrlAcqSw" +
                ",pds0177sf1XbrdrSendCd" +
                ",pds0177sf2XbrdrCurrSendCd" +
                ",pds0177sf1XbrdrRecvCd" +
                ",pds0177sf2XbrdrCurrRecvCd" +
                ",pds0071sf2ChipToMagSw" +
                ",pds0043ProgRegId" +
                ",pwcbAmt" +
                ",pwcbSw" +
                ",pds0158sf1AcptBrndCd" +
                ",pds0158sf10LatePrsntCd" +
                ",sendGbaNum" +
                ",de33FwdInstId" +
                ",de54AmtType42ExistsSw" +
                ",de54AmtType58ExistsSw" +
                ",de25MrcNum" +
                ",pds803sf4DmstcDebitCd" +
                ",feederSubtypeCd" +
                ",custPrdctTypeCd" +
                ",pds0158sf4IchgRateDesigCd" +
                ",pds0001sf1AcctNumTypeCd" +
                ",jpnDomCd" +
                ",pds0834sf2CanPremCd" +
                ",ipsSw" +
                ",de93TranDestInstIdCd" +
                ",de94TranOrigInstIdCd" +
                ",de100RcvInstIdCd" +
                ",pds0157AltPrcssrCd" +
                ",pds0158sf12AlmCatCd" +
                ",merchGeoCd" +
                ",de49TranCurrCd" +
                ",multiSetlFeeCd" +
                ",pds0052sf3UcafCollCd" +
                ",de22sf5CardPresDataSw" +
                ",de22sf7CardInputModeSw" +
                ",de43sf6CardAcptCntryCd" +
                ",pds0212sf1ServLvlCd" +
                ",pds0212sf2McRespCd" +
                ",convCurrCd" +
                ",convAcqTranAmt" +
                ",convIssTranAmt" +
                ",strmId" +
                ",recvGbaAmt" +
                ",prepaidCd" +
                ",pds863sf2IccrAmtSw" +
                ",de38ApprPos6Cd" +
                ",pds0176McAssgnId" +
                ",onUsSw" +
                ",de22sf4TrmlOperEnvCd" +
                ",onusDe93De94Sw" +
                ",pwcbAcqAmt" +
                ",atmIntegritySw" +
                ",pds0860NatlCurrSw" +
                ",pds0873B2bCd" +
                ",pds0876CashAcsOnlySw" +
                ",de04Eq54Cd" +
                ",de42CardAcptIdCd" +
                ",pds0045McGenInstlCd" +
                ",pds181s1PosInstlCd" +
                ",pds182s2InstlNum" +
                ",pds0832s9AuthMatchCd" +
                ",pds0838SpndcntrlCd" +
                ",pds0023TrmlTypeCd" +
                ",pds0005MsgErrorCd" +
                ",pds0871GbsSw" +
                ",coBrndOnUsSw" +
                ",de22sf6CardPrsntData" +
                ",pds803s5InstlPymtSrvCd" +
                ",pds0047sf1TradePaymtOptCd" +
                ",enhAdvisOptInSw" +
                ",intIcaPrsntCd" +
                ",pds0165s2SetlInfoTxt" +
                ",pds0158s2BsaTypeCd" +
                ",pds0158sf3BusnServIdCd" +
                ",pds803s6RegEcomProgIssCd" +
                ",pds803s7RegEcomProgAcqCd" +
                ",pds863sf4CcmSw" +
                ",pds863sf18CbcmSw" +
                ",pds863sf10CbfmSw" +
                ",mccGrpCd" +
                ",prdctGrpCd" +
                ",pds803s9NpgCd" +
                ",indonesiaDmstcCd" +
                ",dmstcTranTypeCd" +
                ",pds0141s2CcrCd" +
                ",pds0803s10MultiCurrCd" +
                ",pds0004s1FaiFundSrcCd" +
                ",pds0004sf2FundSendAcctNum" +
                ",pds0014DigitalAcctRefNum" +
                ",de2PrimaryAcctNum" +
                ",de4TranAmt" +
                ",de31AcqRefDataNum" +
                ",guidedTranTypeCd" +
                ",de32AcqInstIdCd" +
                ",cbwpSw" +
                ",pds0866OrigIssMbrId" +
                ",pds0870OrigAcqMbrId" +
                ",de63sf2ClrBnkntNum" +
                ",pds0059TokenId";
    }
}