package com.company.Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLinks {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("reference1.com"));
        System.out.println(test("google.org"));
    }

    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
