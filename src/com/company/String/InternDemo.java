package com.company.String;

public class InternDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);

        s2 = s2.intern();
        System.out.println(s1 == s2);
    }
}
