package com.mughees;

import com.ebay.xcelite.Xcelite;
import com.ebay.xcelite.reader.SheetReader;
import com.ebay.xcelite.sheet.XceliteSheet;
import com.ebay.xcelite.writer.SheetWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args)
    {
        //test code for reading from remote excel file
        Xcelite xcelite2 = new Xcelite(new File("TelemetryData.xlsx"));
        XceliteSheet sheet2 = xcelite2.getSheet("Telemetry Data");
        SheetReader<Collection<Object>> simpleReader = sheet2.getSimpleReader();
        Collection<Collection<Object>> data = simpleReader.read();
        for (Object i : data)
        {
            System.out.print("\t" + i + "\n");
            System.out.print("\t");
        }

        //test code for writing to new excel file
        Xcelite xcelite = new Xcelite();
        XceliteSheet sheet = xcelite.createSheet("Telemetry Data2");
        SheetWriter writer = sheet.getBeanWriter(Write.class);
        ArrayList parameters;
        parameters = new ArrayList<>();
        writer.write(parameters);
        xcelite.write(new File("TelemetryData2.xlsx"));
    }
}