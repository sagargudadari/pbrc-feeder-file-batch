package com.mastercard.batch.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DebitTransactionDetail {
    private String prcssDt;

    private String imeTraceId;

    private String guidePointPartyId;

    private String recTypeSw;

    private String recTypeId;

    private String brndCd;

    private String atmPosSw;

    private String pinSgntrSw;

    private String regnBilledCd;

    private BigDecimal de03ProcSf1Cd;

    private String de03ProcSf2Cd;

    private String de39IsoRespCd;

    private String de63Sf2IchgTypeCd;

    private String de33AcqPrcssrId;

    private String de100IssPrcssrId;

    private String de18MerchTypeCd;

    private String de61Sf7TranStatCd;

    private String de48Se77PaymtTypeCd;

    private String de48Se77OnbehalfServCd;

    private String cvcValdtCd;

    private String pinValdtCd;

    private String pinVerCd;

    private String mtiFuncCd;

    private String compAtmCd;

    private String plusIsaFeeCd;

    private String mcsIssCd;

    private String positiveIdSw;

    private String cardAlertSw;

    private String xbrdrSw;

    private String dynamicConvId;

    private String de54Se2AmtTypeCd;

    private String chdCatLvlId;

    private String posPinEntId;

    private String cdIssId;

    private String de32InstId;

    private String issVi63ChrgId;

    private String pymtServCd;

    private String prodCd;

    private String de4McsMdsCmpAmt;

    private String custPrdctTypeCd;

    private String issProcIcaNum;

    private String issRtIcaNum;

    private String issBinIcaNum;

    private String acqProcIcaNum;

    private String acqRtIcaNum;

    private String acqTertiaryIcaNum;

    private String acqSurchCd;

    private String de54Sf5AcqSrchrgAmt;

    private String issSetlTypeCd;

    private String surchgFreeCd;

    private String revCd;

    private String adjSw;

    private String acqRevRsnCd;

    private String prdctId;

    private String svcLvlCd;

    private String mcRespValId;

    private String convCurrCd;

    private String convTranAmt;

    private String revAdvcRsnCd;

    private String singleAcqDualIssSw;

    private String dualAcqSingleIssSw;

    private String acqIntrfTypeCd;

    private String issIntrfTypeCd;

    private String posEntCd;

    private String merchCntryCd;

    private String tjfIssCntryCd;

    private String tjfAcqCntryCd;

    private String tranCurrCd;

    private String bnkntRefId;

    private String bnkntDt;

    private String issIcaEqAcqIca;

    private String cashBackCd;

    private String convCashBackAmt;

    private String coreServsId;

    private String crDbCd;

    private String mdsIccrCd;

    private String proofOfLifeCd;

    private String mdsCashAcsCd;

    private String de42MerchId;

    private String fdOnUsCd;

    private String de22Sf1PosPanEntId;

    private String daysBetwOrigSetlNum;

    private String posPanMapSvcCd;

    private String gbsSw;

    private String respToCd;

    private String adjCd;

    private String enhAdvisOptInCd;

    private String mdsSetlSw;

    private String custPrsncCd;

    private String atmIssFeeInqCd;

    private String mcbsSpecialAcqId;

    private String mcbsSpecialIssId;

    private String indonesiaDmstcCd;

    private String dmstcTranTypeCd;

    private String ecomSecLvlId;

    private String cardPrsncId;

    private String termInputId;

    private String oboCd;

    private String merchLocCurrCd;

    private String issDefltSetlCurrCd;

    private String acqDefltSetlCurrCd;

    private String issSetlSelCrtrSw;

    private String acqSetlSelCrtrSw;

    private String multCurrCd;

    private String issSetlCurrCd;

    private String acqSetlCurrCd;

    private String digAcctRefNum;

    private String de02AcctNum;

    private String switchDt;

    private String swSerialNum;

    private String bseAcqStlCd;

    private String mcsLocCmpAmt;

    private String mcsLocImpDecId;

    private String atmLocId;

    private String mcsMdsMccrAmt;

    private String pinEntModeId;

    private String usdTranAmtDd;

    private String serial02Num;

    private String adjDt;

    private String adjAmt;

    private String repressDt;

    private String repressAdjAmt;

    private String cashBackUsdAmt;

    private String tokenId;

    public String toCommaSeparatedVariables() {
        return  "prcssDt" +
                ",imeTraceId" +
                ",guidePointPartyId" +
                ",recTypeSw" +
                ",recTypeId" +
                ",brndCd" +
                ",atmPosSw" +
                ",pinSgntrSw" +
                ",regnBilledCd" +
                ",de03ProcSf1Cd" +
                ",de03ProcSf2Cd" +
                ",de39IsoRespCd" +
                ",de63Sf2IchgTypeCd" +
                ",de33AcqPrcssrId" +
                ",de100IssPrcssrId" +
                ",de18MerchTypeCd" +
                ",de61Sf7TranStatCd" +
                ",de48Se77PaymtTypeCd" +
                ",de48Se77OnbehalfServCd" +
                ",cvcValdtCd" +
                ",pinValdtCd" +
                ",pinVerCd" +
                ",mtiFuncCd" +
                ",compAtmCd" +
                ",plusIsaFeeCd" +
                ",mcsIssCd" +
                ",positiveIdSw" +
                ",cardAlertSw" +
                ",xbrdrSw" +
                ",dynamicConvId" +
                ",de54Se2AmtTypeCd" +
                ",chdCatLvlId" +
                ",posPinEntId" +
                ",cdIssId" +
                ",de32InstId" +
                ",issVi63ChrgId" +
                ",pymtServCd" +
                ",prodCd" +
                ",de4McsMdsCmpAmt" +
                ",custPrdctTypeCd" +
                ",issProcIcaNum" +
                ",issRtIcaNum" +
                ",issBinIcaNum" +
                ",acqProcIcaNum" +
                ",acqRtIcaNum" +
                ",acqTertiaryIcaNum" +
                ",acqSurchCd" +
                ",de54Sf5AcqSrchrgAmt" +
                ",issSetlTypeCd" +
                ",surchgFreeCd" +
                ",revCd" +
                ",adjSw" +
                ",acqRevRsnCd" +
                ",prdctId" +
                ",svcLvlCd" +
                ",mcRespValId" +
                ",convCurrCd" +
                ",convTranAmt" +
                ",revAdvcRsnCd" +
                ",singleAcqDualIssSw" +
                ",dualAcqSingleIssSw" +
                ",acqIntrfTypeCd" +
                ",issIntrfTypeCd" +
                ",posEntCd" +
                ",merchCntryCd" +
                ",tjfIssCntryCd" +
                ",tjfAcqCntryCd" +
                ",tranCurrCd" +
                ",bnkntRefId" +
                ",bnkntDt" +
                ",issIcaEqAcqIca" +
                ",cashBackCd" +
                ",convCashBackAmt" +
                ",coreServsId" +
                ",crDbCd" +
                ",mdsIccrCd" +
                ",proofOfLifeCd" +
                ",mdsCashAcsCd" +
                ",de42MerchId" +
                ",fdOnUsCd" +
                ",de22Sf1PosPanEntId" +
                ",daysBetwOrigSetlNum" +
                ",posPanMapSvcCd" +
                ",gbsSw" +
                ",respToCd" +
                ",adjCd" +
                ",enhAdvisOptInCd" +
                ",mdsSetlSw" +
                ",custPrsncCd" +
                ",atmIssFeeInqCd" +
                ",mcbsSpecialAcqId" +
                ",mcbsSpecialIssId" +
                ",indonesiaDmstcCd" +
                ",dmstcTranTypeCd" +
                ",ecomSecLvlId" +
                ",cardPrsncId" +
                ",termInputId" +
                ",oboCd" +
                ",merchLocCurrCd" +
                ",issDefltSetlCurrCd" +
                ",acqDefltSetlCurrCd" +
                ",issSetlSelCrtrSw" +
                ",acqSetlSelCrtrSw" +
                ",multCurrCd" +
                ",issSetlCurrCd" +
                ",acqSetlCurrCd" +
                ",digAcctRefNum" +
                ",de02AcctNum" +
                ",switchDt" +
                ",swSerialNum" +
                ",bseAcqStlCd" +
                ",mcsLocCmpAmt" +
                ",mcsLocImpDecId" +
                ",atmLocId" +
                ",mcsMdsMccrAmt" +
                ",pinEntModeId" +
                ",usdTranAmtDd" +
                ",serial02Num" +
                ",adjDt" +
                ",adjAmt" +
                ",repressDt" +
                ",repressAdjAmt" +
                ",cashBackUsdAmt" +
                ",tokenId";

    }
}