package com.company.Time;

import java.time.Instant;
import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1980, 6, 14);
        Instant instant = Instant.now();
//        System.out.println(localDate1.getDayOfWeek());
//        System.out.println(localDate1.getDayOfYear());
//        System.out.println(localDate1.getMonth());
//        System.out.println(localDate1.getYear());
//        System.out.println(localDate1.getEra());

        LocalDate localDate2 = LocalDate.now();
        System.out.println(localDate1);
        System.out.println(localDate2);

        System.out.println(localDate2.isAfter(localDate1));
        System.out.println(localDate2.isBefore(localDate1));
        System.out.println(localDate2.isLeapYear());
    }
}
