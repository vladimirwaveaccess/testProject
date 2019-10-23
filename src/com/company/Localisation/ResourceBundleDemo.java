package com.company.Localisation;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import static java.nio.charset.StandardCharsets.*;

public class ResourceBundleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo(new Locale("ru", "UA"));
        printInfo(new Locale("ua", "UA"));
        printInfo(new Locale("en", "US"));
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(2));
    }

    private static void printInfo(Locale locale) throws UnsupportedEncodingException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("topic", locale);

        for (String key: resourceBundle.keySet()) {
            String value = resourceBundle.getString(key);
            value = new String(value.getBytes("ISO_8859_1"), UTF_8);
            System.out.println(key + " " + value);
        }
        System.out.println();
    }
}
