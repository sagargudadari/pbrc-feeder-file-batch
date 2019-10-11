package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

@Data
public class AuthTransactionDetail {

    private String prcssDt;

    private String imeTraceId;

    private String guidePointPartyId;

    private BigDecimal mtiFuncCd;

    private String de48TranTypeCd;

    private BigDecimal de39RespCd;

    private BigDecimal de33ForwardingIcaId;

    private String acqContractSw;

    private String de126Se50IssContractSw;

    private String systemId;

    private String de48Se71OnbehalfServCd;

    private BigDecimal respTypeCd;

    private String entPointCd;

    private String dupCallSw;

    private String cardTypeCd;

    private String de112Se11TranId;

    private String pvlSw;

    private String jcbSw;

    private String acqIntrfceCd;

    private String issIntrfceCd;

    private String abatTranCd;

    private String giaAvailableSw;

    private String giaFirstSw;

    private String authSwitchSw;

    private String feederSubtypeCd;

    private String sourceCd;

    private String de48Se77PaymtTranCd;

    private String downRsnCd;

    private String sgntrPinCd;

    private String de18MerchTypeCd;

    private String custPrdctTypeCd;

    private String de48AvsReqCd;

    private String cntrlAcqCd;

    private String prepaidCd;

    private String grpSigninNum;

    private String mbrEndpntNum;

    private String ipsSw;

    private String de60Sf1AdvRsnDe60Sf1Cd;

    private String de48Se87CvcValidateCd;

    private String de126Se32MceCvc1ValCd;

    private String pinPrevalSw;

    private String pinVldtnSw;

    private String mchipMagstripeSw;

    private String aavSw;

    private String aavStandinSw;

    private String mchipCrypPrevalSw;

    private String mchipStandinSw;

    private String issIcaNum;

    private String acqIcaNum;

    private String servTypeAcqCd;

    private String de3Sf1ProcCd;

    private String de70NtwkMgmtInfoCd;

    private String de61PosTranStatCd;

    private String de22F2PosPanEntModeCd;

    private String de61PosCardPrsncCd;

    private String de48Se83AvsRespCd;

    private String de48Se87CrdValidCd;

    private String de48Se51EmsObsCd;

    private String de48Se61Sf4MerchscoreSw;

    private String merchIcaNum;

    private String usdAmt;

    private String convCurrCd;

    private String convTranAmt;

    private String acptBrndCd;

    private String destId;

    private String preAuthCd;

    private String merchRegnCd;

    private String merchCntryCd;

    private String de61Sf11TrmlInputSw;

    private String de126Se15IccrServCd;

    private String de48Se95InstlCd;

    private String de61Sf4CardhldrPrsncSw;

    private String onUsSw;

    private String de61Sf3PosTrmlLocCd;

    private String de126Se25EmsServCd;

    private String de112Se09InstlPaymtCd;

    private String dmstcSrcCd;

    private String b2bCd;

    private String proofOfLifeSw;

    private String de48se32McAssgnId;

    private String cashOutPosCd;

    private String finNetworkCd;

    private String gbsServCd;

    private String onUsPlusFwdCd;

    private String iccrAuthOnlyCd;

    private String onUsId;

    private String de112Se21InstPymtDataCd;

    private String de48Se62AchCd;

    private String de48Se42UcafSecCd;

    private String undefAuthCd;

    private String indonesiaDmstcCd;

    private String dmstcTranTypeCd;

    private BigDecimal de2CardNum;

    private BigDecimal crteDt;

    private BigDecimal crteTm;

    private String refNum;

    private String rspBy;

    private BigDecimal acqIcaCustId;

    private BigDecimal issIcaCustId;

    private BigDecimal locCurrAmt;

    private BigDecimal locCurrCd;

    private String failRsnCd;

    private String fullFailRsnCd;

    private String merchId;

    private String de48Se64TrnstTranId;

    private String origAcqRegnCd;

    private String origAcqCntryCd;

    private String regnCntryChngSw;

    private String origIssRegnCd;

    private String origIssCntryCd;

    private String origGeoCd;

    private String de48Se61Sf5FinalAuthCd;

    public String toCommaSeparatedVariables() {
        return  "prcssDt" +
                ",imeTraceId" +
                ",guidePointPartyId" +
                ",mtiFuncCd" +
                ",de48TranTypeCd" +
                ",de39RespCd" +
                ",de33ForwardingIcaId" +
                ",acqContractSw" +
                ",de126Se50IssContractSw" +
                ",systemId" +
                ",de48Se71OnbehalfServCd" +
                ",respTypeCd" +
                ",entPointCd" +
                ",dupCallSw" +
                ",cardTypeCd" +
                ",de112Se11TranId" +
                ",pvlSw" +
                ",jcbSw" +
                ",acqIntrfceCd" +
                ",issIntrfceCd" +
                ",abatTranCd" +
                ",giaAvailableSw" +
                ",giaFirstSw" +
                ",authSwitchSw" +
                ",feederSubtypeCd" +
                ",sourceCd" +
                ",de48Se77PaymtTranCd" +
                ",downRsnCd" +
                ",sgntrPinCd" +
                ",de18MerchTypeCd" +
                ",custPrdctTypeCd" +
                ",de48AvsReqCd" +
                ",cntrlAcqCd" +
                ",prepaidCd" +
                ",grpSigninNum" +
                ",mbrEndpntNum" +
                ",ipsSw" +
                ",de60Sf1AdvRsnDe60Sf1Cd" +
                ",de48Se87CvcValidateCd" +
                ",de126Se32MceCvc1ValCd" +
                ",pinPrevalSw" +
                ",pinVldtnSw" +
                ",mchipMagstripeSw" +
                ",aavSw" +
                ",aavStandinSw" +
                ",mchipCrypPrevalSw" +
                ",mchipStandinSw" +
                ",issIcaNum" +
                ",acqIcaNum" +
                ",servTypeAcqCd" +
                ",de3Sf1ProcCd" +
                ",de70NtwkMgmtInfoCd" +
                ",de61PosTranStatCd" +
                ",de22F2PosPanEntModeCd" +
                ",de61PosCardPrsncCd" +
                ",de48Se83AvsRespCd" +
                ",de48Se87CrdValidCd" +
                ",de48Se51EmsObsCd" +
                ",de48Se61Sf4MerchscoreSw" +
                ",merchIcaNum" +
                ",usdAmt" +
                ",convCurrCd" +
                ",convTranAmt" +
                ",acptBrndCd" +
                ",destId" +
                ",preAuthCd" +
                ",merchRegnCd" +
                ",merchCntryCd" +
                ",de61Sf11TrmlInputSw" +
                ",de126Se15IccrServCd" +
                ",de48Se95InstlCd" +
                ",de61Sf4CardhldrPrsncSw" +
                ",onUsSw" +
                ",de61Sf3PosTrmlLocCd" +
                ",de126Se25EmsServCd" +
                ",de112Se09InstlPaymtCd" +
                ",dmstcSrcCd" +
                ",b2bCd" +
                ",proofOfLifeSw" +
                ",de48se32McAssgnId" +
                ",cashOutPosCd" +
                ",finNetworkCd" +
                ",gbsServCd" +
                ",onUsPlusFwdCd" +
                ",iccrAuthOnlyCd" +
                ",onUsId" +
                ",de112Se21InstPymtDataCd" +
                ",de48Se62AchCd" +
                ",de48Se42UcafSecCd" +
                ",undefAuthCd" +
                ",indonesiaDmstcCd" +
                ",dmstcTranTypeCd" +
                ",de2CardNum" +
                ",crteDt" +
                ",crteTm" +
                ",refNum" +
                ",rspBy" +
                ",acqIcaCustId" +
                ",issIcaCustId" +
                ",locCurrAmt" +
                ",locCurrCd" +
                ",failRsnCd" +
                ",fullFailRsnCd" +
                ",merchId" +
                ",de48Se64TrnstTranId" +
                ",origAcqRegnCd" +
                ",origAcqCntryCd" +
                ",regnCntryChngSw" +
                ",origIssRegnCd" +
                ",origIssCntryCd" +
                ",origGeoCd" +
                ",de48Se61Sf5FinalAuthCd";
    }
}