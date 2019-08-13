/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stefa
 */
public class Util {

    public static int Int(String string) {

        return Util.empty(string) ? 0 : Integer.valueOf(string);
    }

    public static boolean Boolean(String string) {
        return Boolean.valueOf(string.toLowerCase());
    }

    public static Date Date(String string) {
        java.sql.Date sqlDate;

        if (!Util.empty(string)) {
            String[] waste = string.split(" ");
            String[] parts = waste[0].split("/");

            java.util.Date utilDate;
            String month = parts[0];
            String day = parts[1];
            String year = parts[2];
            if (waste.length == 2) {
                String[] parts2 = waste[1].split(":");
                if (parts2.length > 2) {
                    String hour = parts2[0];
                    String minutes = parts2[1];
                    String seconds = parts2[2];
                    Calendar c = Calendar.getInstance();
                    c.set(Util.Int(year), Util.Int(month), Util.Int(day), Util.Int(hour), Util.Int(minutes), Util.Int(seconds));
                    sqlDate = new Date(c.getTimeInMillis());
                } else {
                    String hour = parts2[0];
                    String minutes = parts2[1];
                    Calendar c = Calendar.getInstance();
                    c.set(Util.Int(year), Util.Int(month), Util.Int(day), Util.Int(hour), Util.Int(minutes), 0);
                    sqlDate = new Date(c.getTimeInMillis());
                }
            } else {
                Calendar c = Calendar.getInstance();
                c.set(Util.Int(year), Util.Int(month), Util.Int(day));
                sqlDate = new Date(c.getTimeInMillis());
            }
            return sqlDate;
        }
        return null;

    }

    public static double Double(String string) {
        if (Util.empty(string)) {
            return 0.0;
        } else {
            if (string.contains(",")) {
                String newString = string.replace(',', '.');
                return Double.valueOf(newString);
            }
            return Double.valueOf(string);
        }
    }

    public static BigDecimal BigDecimal(String string) {
        if (Util.empty(string)) {
            return new BigDecimal(0);
        } else {
            if(string.contains("+")){
                string = string.replace("+", "");
            }
            if (string.contains(",")) {
                string = string.replace(',', '.');
            }
            return new BigDecimal(string);
        }
    }

    public static boolean empty(String string) {
        return string.isEmpty() || string.isBlank();
    }
}
