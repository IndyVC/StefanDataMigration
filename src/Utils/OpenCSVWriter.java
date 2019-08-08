/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Adressen.Adres;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.ICSVWriter;
import enums.Land;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class OpenCSVWriter {

    public static <T> void writeCSVFile(List<T> objects, Class<T> type) throws IOException, IllegalArgumentException, IllegalAccessException {

        String filepath = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\export csv\\" + type.getSimpleName() + ".csv";
        List<String[]> allData = new ArrayList();
        Field[] colFields = type.getFields();
        String[] colNames = new String[colFields.length];
        
        for(int i=0;i<colFields.length;i++){
            colNames[i] = colFields[i].getName();
        }
        
        allData.add(colNames);
        
        for (T obj : objects) {
            List<String> data = new ArrayList();

            for (Field field : type.getFields()) {
                String value = "";

                if (field.get(obj) == null) {
                    value = "null";
                } else {

                    if (field.getType().isEnum()) {
                        if (field.get(obj) instanceof Land) {
                            value = String.valueOf(Land.valueOf(field.get(obj).toString()).ordinal());
                        }
                    } else if (field.getType() == Adres.class) {
                        Adres idClass = (Adres) field.get(obj);
                        int id = idClass.getAdresId();
                        value = String.valueOf(id);
                    } else {
                        value = field.get(obj).toString();
                    }
                }
                data.add(value);
            }

            allData.add(data.toArray(new String[data.size()]));

        }
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(filepath));
                ICSVWriter csvWriter = new CSVWriterBuilder(writer)
                        .withSeparator(';')
                        .withEscapeChar('£')
                        .withQuoteChar('"')
                        .build();) {
            csvWriter.writeAll(allData);
        }

    }

}
