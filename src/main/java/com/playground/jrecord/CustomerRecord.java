package com.playground.jrecord;

import net.sf.JRecord.Common.Constants;
import net.sf.JRecord.Details.AbstractLine;
import net.sf.JRecord.External.CopybookLoader;
import net.sf.JRecord.IO.AbstractLineReader;
import net.sf.JRecord.IO.CobolIoProvider;
import net.sf.JRecord.Numeric.Convert;

public class CustomerRecord {

    public static void main(String[] args) throws Exception {

        CobolIoProvider ioProvider = CobolIoProvider.getInstance();

        AbstractLineReader reader = ioProvider.getLineReader(
                Constants.IO_TEXT_LINE,
                Convert.FMT_INTEL,
                CopybookLoader.SPLIT_01_LEVEL,
                "src/main/resources/copybook_customers.cpy",
                "src/main/resources/customers.txt");
        // Read a record
        AbstractLine line;
        while ((line = reader.read()) != null ) {
            System.out.println(line.getFieldValue("Record-Id"));
            System.out.println(line.getFieldValue("FirstName"));
            System.out.println(line.getFieldValue("LastName"));
        }
        reader.close();
    }
}
