package com.company.Localisation;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DemoDateFormat {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date d = null;
        String str = "April 9, 2012";

        try {
            d = df.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(df.format(d));

        System.out.println();
        Date d1 = new Date();
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale locale : locales) {
            DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println(locale.toString() + " ---> " + df1.format(d1));
        }
    }
}
