package com.company.Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher("ccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
