package com.company.Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEmail {
    public static void main(String[] args) {
        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
        String s = "e_mail address is: blinov@gmail.com, romanchick@bsu.by!";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("e-mail: " + matcher.group());
        }
    }
}
