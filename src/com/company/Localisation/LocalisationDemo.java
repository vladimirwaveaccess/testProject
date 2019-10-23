package com.company.Localisation;

import java.util.Date;
import java.util.Locale;

public class LocalisationDemo {
    public static void main(String[] args) {
        Locale aDefault = Locale.getDefault();
        System.out.println(aDefault.getDisplayCountry());
        System.out.println(aDefault.getDisplayLanguage());
        System.out.println(new Date());

        Locale.setDefault(Locale.CHINA);
        Locale aDefault1 = Locale.getDefault();
        System.out.println(aDefault1.getDisplayCountry());
        System.out.println(aDefault1.getDisplayLanguage());
        System.out.println(new Date());

        Locale.setDefault(new Locale("ru", "RU"));
        Locale aDefault2 = Locale.getDefault();
        System.out.println(aDefault2.getDisplayCountry());
        System.out.println(aDefault2.getDisplayLanguage());
        System.out.println(new Date());
    }
}
