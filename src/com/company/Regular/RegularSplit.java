package com.company.Regular;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularSplit {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\s?");
        String[] words1 = pattern.split("java5tiger 77 java6mustang");
        System.out.println(Arrays.toString(words1));

        String str = "java5tiger 77 java6mustang";
        String[] words2 = str.split("\\d+\\s?");
        System.out.println(Arrays.toString(words2));
    }
}
