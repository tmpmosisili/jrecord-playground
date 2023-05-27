package com.playground.jrecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.JRecord.Common.Constants;
import net.sf.JRecord.Common.FieldDetail;
import net.sf.JRecord.Common.RecordException;
import net.sf.JRecord.Details.AbstractLine;
import net.sf.JRecord.Details.LayoutDetail;
import net.sf.JRecord.External.CobolCopybookLoader;
import net.sf.JRecord.External.CopybookLoader;
import net.sf.JRecord.External.ExternalRecord;
import net.sf.JRecord.IO.AbstractLineReader;
import net.sf.JRecord.IO.CobolIoProvider;
import net.sf.JRecord.IO.LineIOProvider;
import net.sf.JRecord.Numeric.Convert;
import net.sf.JRecord.Numeric.ICopybookDialects;

import static net.sf.JRecord.External.CopybookLoader.*;

public class Example2 {
    public static void main(String[] args) throws Exception {
        // Load the COBOL copybook
        ExternalRecord copybook = null;
        CobolCopybookLoader loader = new CobolCopybookLoader();
        try {
            copybook = loader.loadCopyBook("c:\\projects\\private\\jrecord-playground\\src\\main\\resources\\cobol.cpy",  0,0, "", CobolCopybookLoader.SPLIT_NONE, 0, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RecordException e) {
            e.printStackTrace();
        }

        // Open the COBOL data file
        CobolIoProvider ioProvider = CobolIoProvider.getInstance();
      //  AbstractLineReader reader = LineIOProvider.getInstance().getLineReader(copybook.);
        AbstractLineReader reader = ioProvider.getLineReader(Constants.IO_TEXT_LINE, Convert.FMT_INTEL, CopybookLoader.SPLIT_NONE,
                "c:\\projects\\private\\jrecord-playground\\src\\main\\resources\\cobol.cpy", "c:\\projects\\private\\jrecord-playground\\src\\main\\resources\\input.txt");

        try {
            reader.open("c:\\projects\\private\\jrecord-playground\\src\\main\\resources\\input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read each record in the data file
        AbstractLine saleRecord;

        while (reader.read() != null) {
            List<Object> line =(ArrayList) reader.read();

            // Convert COMP-3 fields to normal numbers
            for (int i = 0; i < line.size(); i++) {
                //FieldDetail field = copybook.getRecord(0).get;

               // if (field.getType() == Constants.TYPE_PACKED_DECIMAL) {
               //     byte[] bytes = (byte[]) line.get(i);
               //     line.set(i, Convert.fromPackedDecimal(bytes));
               // }
            }

            // Do something with the record
            System.out.println(line);
        }

        // Close the COBOL data file
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
