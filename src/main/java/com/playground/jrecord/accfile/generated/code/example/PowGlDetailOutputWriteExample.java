package com.playground.jrecord.accfile.generated.code.example;

import com.playground.jrecord.accfile.generated.code.cobol.PowGlDetailOutput;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import net.sf.JRecord.cgen.def.IWriter;

public class PowGlDetailOutputWriteExample {

	public static void main(String[] args) throws IOException {

		PowGlDetailOutput line = new PowGlDetailOutput();
       // You need to create a stream for you output file
		IWriter<PowGlDetailOutput> writer = PowGlDetailOutput.getIoProvider().newWriter("filename???");

		for (int i = 0; i < 5; i++) {
			line.gliCurrDataGroup.set(i);
			line.gliSubprodCode.set("" + i);
			line.gliPdTranSign.set(i);
			line.gliPdTranType.set("" + i);
			line.gliPdPaperPaperless.set("" + i);
			line.gliPdInternGen.set("" + i);
			line.gliPdCaptureActy.set("" + i);
			line.gliPdCcpRejCode.set("" + i);
			line.gliPdTransPaycdeAlerts.set("" + i);
			line.gliPdTransPaycdeBlocks.set("" + i);
			line.gliPdProcessStops.set("" + i);
			line.gliPdRestPaycdeAlerts.set("" + i);
			line.gliPdRestPaycdeBlocks.set("" + i);
			line.gliPdRestStopStatus.set("" + i);
			line.gliPdIntDescSet.set("" + i);
			line.gliOverrideBackdateDays.set("" + i);
			line.gliGliSource.set("" + i);
			line.gliDebitCreditNotice.set("" + i);
			line.gliTransNo.set("" + i);
			line.gliCoId.set(i);
			line.gliApplId.set("" + i);
			line.gliFuncId.set("" + i);
			line.gliSourceType.set("" + i);
			line.gliEnvironment.set("" + i);
			line.gliTime.set(i);
			line.gliSysDate.set(i);
			line.gliSource.set("" + i);
			line.gliOperator.set("" + i);
			line.gliSystemSourceId.set("" + i);
			line.gliSourceDeviceType.set("" + i);
			line.gliRemitBranch.set(i);
			line.gliPostDate.set(i);
			line.gliActNo.set(i);
			line.gliTraceId.set("" + i);
			line.gliOfficer.set("" + i);
			line.gliDescription.set("" + i);
			line.gliEffectiveDate.set(i);
			line.gliPdTranCodeReversed.set("" + i);
			line.gliPdCountStmtItem.set("" + i);
			line.gliPdStmtReversalCode.set("" + i);
			line.gliPdDepWd.set("" + i);
			line.gliNoForeignDepItems.set(i);
			line.gliStmtCatg.set(i);
			line.gliTransAmt.set(BigInteger.valueOf(i));
			line.gliApplIdTo.set("" + i);
			line.gliFuncTo.set("" + i);
			line.gliActNoTo.set(i);
			line.gliApplIdFrom.set("" + i);
			line.gliFuncFrom.set("" + i);
			line.gliActNoFrom.set(i);
			line.gliAmtFloat0.set(BigInteger.valueOf(i));
			line.gliNoLocalDepItems.set(i);
			line.gliNoDr.set(i);
			line.gliBranch.set(i);
			line.gliTransSeq.set(i);
			line.gliPaidIntoOd.set("" + i);
			line.gliOverrideTermCode.set("" + i);
			line.gliWithholdMemoFlag.set("" + i);
			line.gliTraceIdCont.set("" + i);
			line.gliDescriptionCont.set("" + i);
			line.gliBranchOfOrigin.set(i);
			line.gliCaptureCenter.set(i);
			line.gliInputCurrency.set("" + i);
			line.gliOrigCurrency.set("" + i);
			line.gliOrigCurrTranAmt.set("" + i);
			line.gliCutoffStmtDate.set(i);
			line.gliOverrideIntCode.set("" + i);
			line.gliOverrideRate.set(BigDecimal.valueOf(i));
			line.gliOverrideTermAmt.set(i);
			line.gliPdRevOrigSeq.set(i);
			line.gliPdRevOrigOccur.set(i);
			line.gliIntPaidNotDisbursed.set(BigDecimal.valueOf(i));
			line.gliLocSvChgColl.set(BigDecimal.valueOf(i));
			line.gliLocLtChgColl.set(BigDecimal.valueOf(i));
			line.gliLocMiscChgColl.set(BigDecimal.valueOf(i));
			line.gliFeeRegion.set("" + i);
			line.gliPaymentType.set("" + i);
			line.gliPaymentSequence.set(i);
			line.gliXferProdCode.set("" + i);
			line.gliXferActNo.set("" + i);
			line.gliTxnReasonCode.set("" + i);
			line.gliReversalTxnOrigSource.set("" + i);
			line.gliDeviceOriginBranch.set(i);
			writer.write(line);
		}
		writer.close();
	}
}

