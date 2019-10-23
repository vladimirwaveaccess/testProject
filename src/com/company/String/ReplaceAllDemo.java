package com.company.String;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        int i = Integer.parseInt("kitty123".replaceAll("[\\D]", ""));
        int j = Integer.parseInt("123kitty".replaceAll("[\\D]", ""));
        int k = Integer.parseInt("1k2it3ty".replaceAll("[\\D]", ""));

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
