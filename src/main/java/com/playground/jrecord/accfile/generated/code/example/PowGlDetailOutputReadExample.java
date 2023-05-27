package com.playground.jrecord.accfile.generated.code.example;

import com.playground.jrecord.accfile.generated.code.cobol.PowGlDetailOutput;
import java.io.IOException;
import net.sf.JRecord.cgen.def.IReader;

public class PowGlDetailOutputReadExample {

	public static void main(String[] args) throws IOException {
       // You need provide a file/stream for your input file
		IReader<PowGlDetailOutput> reader = PowGlDetailOutput.getIoProvider().newReader("filename???");
		PowGlDetailOutput line;
		
		while ((line = reader.read()) != null) {
			System.out.println(""
				+ line.gliCurrDataGroup.asInt() + "\t"
				+ line.gliSubprodCode.asString() + "\t"
				+ line.gliPdTranSign.asInt() + "\t"
				+ line.gliPdTranType.asString() + "\t"
				+ line.gliPdPaperPaperless.asString() + "\t"
				+ line.gliPdInternGen.asString() + "\t"
				+ line.gliPdCaptureActy.asString() + "\t"
				+ line.gliPdCcpRejCode.asString() + "\t"
				+ line.gliPdTransPaycdeAlerts.asString() + "\t"
				+ line.gliPdTransPaycdeBlocks.asString() + "\t"
				+ line.gliPdProcessStops.asString() + "\t"
				+ line.gliPdRestPaycdeAlerts.asString() + "\t"
				+ line.gliPdRestPaycdeBlocks.asString() + "\t"
				+ line.gliPdRestStopStatus.asString() + "\t"
				+ line.gliPdIntDescSet.asString() + "\t"
				+ line.gliOverrideBackdateDays.asString() + "\t"
				+ line.gliGliSource.asString() + "\t"
				+ line.gliDebitCreditNotice.asString() + "\t"
				+ line.gliTransNo.asString() + "\t"
				+ line.gliCoId.asInt() + "\t"
				+ line.gliApplId.asString() + "\t"
				+ line.gliFuncId.asString() + "\t"
				+ line.gliSourceType.asString() + "\t"
				+ line.gliEnvironment.asString() + "\t"
				+ line.gliTime.asInt() + "\t"
				+ line.gliSysDate.asInt() + "\t"
				+ line.gliSource.asString() + "\t"
				+ line.gliOperator.asString() + "\t"
				+ line.gliSystemSourceId.asString() + "\t"
				+ line.gliSourceDeviceType.asString() + "\t"
				+ line.gliRemitBranch.asInt() + "\t"
				+ line.gliPostDate.asInt() + "\t"
				+ line.gliActNo.asLong() + "\t"
				+ line.gliTraceId.asString() + "\t"
				+ line.gliOfficer.asString() + "\t"
				+ line.gliDescription.asString() + "\t"
				+ line.gliEffectiveDate.asInt() + "\t"
				+ line.gliPdTranCodeReversed.asString() + "\t"
				+ line.gliPdCountStmtItem.asString() + "\t"
				+ line.gliPdStmtReversalCode.asString() + "\t"
				+ line.gliPdDepWd.asString() + "\t"
				+ line.gliNoForeignDepItems.asInt() + "\t"
				+ line.gliStmtCatg.asInt() + "\t"
				+ line.gliTransAmt.asBigInteger() + "\t"
				+ line.gliApplIdTo.asString() + "\t"
				+ line.gliFuncTo.asString() + "\t"
				+ line.gliActNoTo.asLong() + "\t"
				+ line.gliApplIdFrom.asString() + "\t"
				+ line.gliFuncFrom.asString() + "\t"
				+ line.gliActNoFrom.asLong() + "\t"
				+ line.gliAmtFloat0.asBigInteger() + "\t"
				+ line.gliNoLocalDepItems.asInt() + "\t"
				+ line.gliNoDr.asInt() + "\t"
				+ line.gliBranch.asInt() + "\t"
				+ line.gliTransSeq.asInt() + "\t"
				+ line.gliPaidIntoOd.asString() + "\t"
				+ line.gliOverrideTermCode.asString() + "\t"
				+ line.gliWithholdMemoFlag.asString() + "\t"
				+ line.gliTraceIdCont.asString() + "\t"
				+ line.gliDescriptionCont.asString() + "\t"
				+ line.gliBranchOfOrigin.asInt() + "\t"
				+ line.gliCaptureCenter.asInt() + "\t"
				+ line.gliInputCurrency.asString() + "\t"
				+ line.gliOrigCurrency.asString() + "\t"
				+ line.gliOrigCurrTranAmt.asString() + "\t"
				+ line.gliCutoffStmtDate.asInt() + "\t"
				+ line.gliOverrideIntCode.asString() + "\t"
				+ line.gliOverrideRate.asBigDecimal() + "\t"
				+ line.gliOverrideTermAmt.asInt() + "\t"
				+ line.gliPdRevOrigSeq.asInt() + "\t"
				+ line.gliPdRevOrigOccur.asInt() + "\t"
				+ line.gliIntPaidNotDisbursed.asBigDecimal() + "\t"
				+ line.gliLocSvChgColl.asBigDecimal() + "\t"
				+ line.gliLocLtChgColl.asBigDecimal() + "\t"
				+ line.gliLocMiscChgColl.asBigDecimal() + "\t"
				+ line.gliFeeRegion.asString() + "\t"
				+ line.gliPaymentType.asString() + "\t"
				+ line.gliPaymentSequence.asLong() + "\t"
				+ line.gliXferProdCode.asString() + "\t"
				+ line.gliXferActNo.asString() + "\t"
				+ line.gliTxnReasonCode.asString() + "\t"
				+ line.gliReversalTxnOrigSource.asString() + "\t"
				+ line.gliDeviceOriginBranch.asInt() + "\t"
			);
		}
		reader.close();
	}
}

