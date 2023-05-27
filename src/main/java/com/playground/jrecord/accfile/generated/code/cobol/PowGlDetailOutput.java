package com.playground.jrecord.accfile.generated.code.cobol;

import net.sf.JRecord.Common.BasicFileSchema;
import net.sf.JRecord.Common.Constants;
import net.sf.JRecord.Common.FieldDetail;
import net.sf.JRecord.Details.IGetByteData;
import net.sf.JRecord.Details.fieldValue.IBigIntegerField;
import net.sf.JRecord.Details.fieldValue.IDecimalField;
import net.sf.JRecord.Details.fieldValue.IIntField;
import net.sf.JRecord.Details.fieldValue.ILongField;
import net.sf.JRecord.Details.fieldValue.IStringField;
import net.sf.JRecord.Types.Type;
import net.sf.JRecord.cgen.impl.fields.FieldValueCG;
import net.sf.JRecord.cgen.impl.io.IoProvider;


public class PowGlDetailOutput implements IGetByteData {


	private static IoProvider<PowGlDetailOutput, PowGlDetailOutput> provider = new IoProvider<PowGlDetailOutput, PowGlDetailOutput>(
			BasicFileSchema.newFixedSchema(Constants.IO_BIN_TEXT, true, 1013, "cp1252"),
			rec -> new PowGlDetailOutput(rec));
	
	public static IoProvider<PowGlDetailOutput, PowGlDetailOutput> getIoProvider() { return provider;};


	private byte[] cobolData;

	public PowGlDetailOutput() {
		cobolData = new byte[1013];
	}

	public PowGlDetailOutput(byte[] cobolData) {
		this.cobolData = cobolData;
	}

		@Override public byte[] getData() {
			return cobolData;
		}

		@Override public void setData(byte[] data) {
			this.cobolData = data;
		}

	public final IIntField gliCurrDataGroup = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-CURR-DATA-GROUP", Type.ftPositiveBinaryBigEndian, 1, 2, 0, "cp1252"));
	public final IStringField gliSubprodCode = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-SUBPROD-CODE", Type.ftChar, 3, 2, 0, "cp1252"));
	public final IIntField gliPdTranSign = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-TRAN-SIGN", Type.ftPackedDecimal, 5, 1, 0, "cp1252"));
	public final IStringField gliPdTranType = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-TRAN-TYPE", Type.ftChar, 6, 1, 0, "cp1252"));
	public final IStringField gliPdPaperPaperless = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-PAPER-PAPERLESS", Type.ftChar, 7, 1, 0, "cp1252"));
	public final IStringField gliPdInternGen = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-INTERN-GEN", Type.ftChar, 8, 1, 0, "cp1252"));
	public final IStringField gliPdCaptureActy = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-CAPTURE-ACTY", Type.ftChar, 9, 2, 0, "cp1252"));
	public final IStringField gliPdCcpRejCode = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-CCP-REJ-CODE", Type.ftChar, 11, 2, 0, "cp1252"));
	public final IStringField gliPdTransPaycdeAlerts = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-TRANS-PAYCDE-ALERTS", Type.ftChar, 13, 1, 0, "cp1252"));
	public final IStringField gliPdTransPaycdeBlocks = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-TRANS-PAYCDE-BLOCKS", Type.ftChar, 14, 1, 0, "cp1252"));
	public final IStringField gliPdProcessStops = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-PROCESS-STOPS", Type.ftChar, 15, 1, 0, "cp1252"));
	public final IStringField gliPdRestPaycdeAlerts = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-REST-PAYCDE-ALERTS", Type.ftChar, 16, 1, 0, "cp1252"));
	public final IStringField gliPdRestPaycdeBlocks = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-REST-PAYCDE-BLOCKS", Type.ftChar, 17, 1, 0, "cp1252"));
	public final IStringField gliPdRestStopStatus = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-REST-STOP-STATUS", Type.ftChar, 18, 1, 0, "cp1252"));
	public final IStringField gliPdIntDescSet = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-INT-DESC-SET", Type.ftChar, 19, 1, 0, "cp1252"));
	public final IStringField gliOverrideBackdateDays = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-OVERRIDE-BACKDATE-DAYS", Type.ftChar, 20, 1, 0, "cp1252"));
	public final IStringField gliGliSource = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-GLI-SOURCE", Type.ftChar, 21, 1, 0, "cp1252"));
	public final IStringField gliDebitCreditNotice = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-DEBIT-CREDIT-NOTICE", Type.ftChar, 22, 1, 0, "cp1252"));
	public final IStringField gliTransNo = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-TRANS-NO", Type.ftChar, 23, 4, 0, "cp1252"));
	public final IIntField gliCoId = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-CO-ID", Type.ftPositiveBinaryBigEndian, 27, 2, 0, "cp1252"));
	public final IStringField gliApplId = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-APPL-ID", Type.ftChar, 29, 2, 0, "cp1252"));
	public final IStringField gliFuncId = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-FUNC-ID", Type.ftChar, 31, 2, 0, "cp1252"));
	public final IStringField gliSourceType = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-SOURCE-TYPE", Type.ftChar, 33, 2, 0, "cp1252"));
	public final IStringField gliEnvironment = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-ENVIRONMENT", Type.ftChar, 35, 2, 0, "cp1252"));
	public final IIntField gliTime = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-TIME", Type.ftPackedDecimal, 37, 4, 0, "cp1252"));
	public final IIntField gliSysDate = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-SYS-DATE", Type.ftPackedDecimal, 41, 4, 0, "cp1252"));
	public final IStringField gliSource = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-SOURCE", Type.ftChar, 45, 8, 0, "cp1252"));
	public final IStringField gliOperator = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-OPERATOR", Type.ftChar, 53, 20, 0, "cp1252"));
	public final IStringField gliSystemSourceId = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-SYSTEM-SOURCE-ID", Type.ftChar, 53, 3, 0, "cp1252"));
	public final IStringField gliSourceDeviceType = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-SOURCE-DEVICE-TYPE", Type.ftChar, 56, 2, 0, "cp1252"));
	public final IIntField gliRemitBranch = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-REMIT-BRANCH", Type.ftNumZeroPaddedPositive, 58, 6, 0, "cp1252"));
	public final IIntField gliPostDate = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-POST-DATE", Type.ftPackedDecimal, 73, 4, 0, "cp1252"));
	public final ILongField gliActNo = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-ACT-NO", Type.ftPackedDecimalPostive   , 77, 8, 0, "cp1252"));
	public final IStringField gliTraceId = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-TRACE-ID", Type.ftChar, 85, 20, 0, "cp1252"));
	public final IStringField gliOfficer = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-OFFICER", Type.ftChar, 105, 5, 0, "cp1252"));
	public final IStringField gliDescription = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-DESCRIPTION", Type.ftChar, 110, 47, 0, "cp1252"));
	public final IIntField gliEffectiveDate = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-EFFECTIVE-DATE", Type.ftPackedDecimal, 157, 4, 0, "cp1252"));
	public final IStringField gliPdTranCodeReversed = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-TRAN-CODE-REVERSED", Type.ftChar, 161, 2, 0, "cp1252"));
	public final IStringField gliPdCountStmtItem = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-COUNT-STMT-ITEM", Type.ftChar, 163, 1, 0, "cp1252"));
	public final IStringField gliPdStmtReversalCode = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-STMT-REVERSAL-CODE", Type.ftChar, 164, 1, 0, "cp1252"));
	public final IStringField gliPdDepWd = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-DEP-WD", Type.ftChar, 165, 1, 0, "cp1252"));
	public final IIntField gliNoForeignDepItems = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-NO-FOREIGN-DEP-ITEMS", Type.ftBinaryBigEndian        , 166, 2, 0, "cp1252"));
	public final IIntField gliStmtCatg = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-STMT-CATG", Type.ftPackedDecimal, 168, 2, 0, "cp1252"));
	public final IBigIntegerField gliTransAmt = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-TRANS-AMT", Type.ftPackedDecimal, 170, 37, 0, "cp1252"));
	public final IStringField gliApplIdTo = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-APPL-ID-TO", Type.ftChar, 207, 2, 0, "cp1252"));
	public final IStringField gliFuncTo = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-FUNC-TO", Type.ftChar, 209, 2, 0, "cp1252"));
	public final ILongField gliActNoTo = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-ACT-NO-TO", Type.ftPackedDecimalPostive   , 211, 8, 0, "cp1252"));
	public final IStringField gliApplIdFrom = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-APPL-ID-FROM", Type.ftChar, 219, 2, 0, "cp1252"));
	public final IStringField gliFuncFrom = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-FUNC-FROM", Type.ftChar, 221, 2, 0, "cp1252"));
	public final ILongField gliActNoFrom = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-ACT-NO-FROM", Type.ftPackedDecimalPostive   , 223, 8, 0, "cp1252"));
	public final IBigIntegerField gliAmtFloat0 = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-AMT-FLOAT-0", Type.ftPackedDecimal, 231, 95, 0, "cp1252"));
	public final IIntField gliNoLocalDepItems = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-NO-LOCAL-DEP-ITEMS", Type.ftPackedDecimal, 326, 3, 0, "cp1252"));
	public final IIntField gliNoDr = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-NO-DR", Type.ftPackedDecimal, 329, 3, 0, "cp1252"));
	public final IIntField gliBranch = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-BRANCH", Type.ftPackedDecimal, 332, 3, 0, "cp1252"));
	public final IIntField gliTransSeq = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-TRANS-SEQ", Type.ftPackedDecimal, 335, 4, 0, "cp1252"));
	public final IStringField gliPaidIntoOd = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PAID-INTO-OD", Type.ftChar, 339, 1, 0, "cp1252"));
	public final IStringField gliOverrideTermCode = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-OVERRIDE-TERM-CODE", Type.ftChar, 340, 1, 0, "cp1252"));
	public final IStringField gliWithholdMemoFlag = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-WITHHOLD-MEMO-FLAG", Type.ftChar, 341, 1, 0, "cp1252"));
	public final IStringField gliTraceIdCont = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-TRACE-ID-CONT", Type.ftChar, 342, 10, 0, "cp1252"));
	public final IStringField gliDescriptionCont = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-DESCRIPTION-CONT", Type.ftChar, 352, 53, 0, "cp1252"));
	public final IIntField gliBranchOfOrigin = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-BRANCH-OF-ORIGIN", Type.ftPackedDecimal, 405, 3, 0, "cp1252"));
	public final IIntField gliCaptureCenter = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-CAPTURE-CENTER", Type.ftPackedDecimal, 408, 5, 0, "cp1252"));
	public final IStringField gliInputCurrency = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-INPUT-CURRENCY", Type.ftChar, 413, 3, 0, "cp1252"));
	public final IStringField gliOrigCurrency = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-ORIG-CURRENCY", Type.ftChar, 416, 3, 0, "cp1252"));
	public final IStringField gliOrigCurrTranAmt = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-ORIG-CURR-TRAN-AMT", Type.ftChar, 419, 104, -1, "cp1252"));
	public final IIntField gliCutoffStmtDate = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-CUTOFF-STMT-DATE", Type.ftPackedDecimal, 523, 4, 0, "cp1252"));
	public final IStringField gliOverrideIntCode = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-OVERRIDE-INT-CODE", Type.ftChar, 527, 2, 0, "cp1252"));
	public final IDecimalField gliOverrideRate = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-OVERRIDE-RATE", Type.ftPackedDecimal, 529, 4, 5, "cp1252"));
	public final IIntField gliOverrideTermAmt = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-OVERRIDE-TERM-AMT", Type.ftPackedDecimal, 533, 3, 0, "cp1252"));
	public final IIntField gliPdRevOrigSeq = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-REV-ORIG-SEQ", Type.ftBinaryBigEndian        , 536, 2, 0, "cp1252"));
	public final IIntField gliPdRevOrigOccur = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PD-REV-ORIG-OCCUR", Type.ftBinaryBigEndian        , 538, 2, 0, "cp1252"));
	public final IDecimalField gliIntPaidNotDisbursed = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-INT-PAID-NOT-DISBURSED", Type.ftPackedDecimal, 540, 6, 2, "cp1252"));
	public final IDecimalField gliLocSvChgColl = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-LOC-SV-CHG-COLL", Type.ftPackedDecimal, 546, 5, 2, "cp1252"));
	public final IDecimalField gliLocLtChgColl = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-LOC-LT-CHG-COLL", Type.ftPackedDecimal, 551, 5, 2, "cp1252"));
	public final IDecimalField gliLocMiscChgColl = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-LOC-MISC-CHG-COLL", Type.ftPackedDecimal, 556, 5, 2, "cp1252"));
	public final IStringField gliFeeRegion = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-FEE-REGION", Type.ftChar, 561, 4, 0, "cp1252"));
	public final IStringField gliPaymentType = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PAYMENT-TYPE", Type.ftChar, 565, 2, 0, "cp1252"));
	public final ILongField gliPaymentSequence = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-PAYMENT-SEQUENCE", Type.ftBinaryBigEndian        , 567, 8, 0, "cp1252"));
	public final IStringField gliXferProdCode = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-XFER-PROD-CODE", Type.ftChar, 575, 3, 0, "cp1252"));
	public final IStringField gliXferActNo = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-XFER-ACT-NO", Type.ftChar, 578, 23, 0, "cp1252"));
	public final IStringField gliTxnReasonCode = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-TXN-REASON-CODE", Type.ftChar, 601, 3, 0, "cp1252"));
	public final IStringField gliReversalTxnOrigSource = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-REVERSAL-TXN-ORIG-SOURCE", Type.ftChar, 604, 8, 0, "cp1252"));
	public final IIntField gliDeviceOriginBranch = new FieldValueCG(this, FieldDetail.newFixedWidthField("GLI-DEVICE-ORIGIN-BRANCH", Type.ftPackedDecimal, 612, 3, 0, "cp1252"));
}
