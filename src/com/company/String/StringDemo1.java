package com.company.String;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "jhksfdjhsdfdj";
        String s1 = new String("jfjfjfjfjfjf");
        char[] s2 = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s3 = new String(s2);

        String s4 = new String(s2, 2, 3);

        System.out.println("abc".charAt(1));

        String s5 = "This is a demo of the getChars method.";
        char[] buf = new char[14 - 10];
        s5.getChars(10, 14, buf, 0);
        System.out.println(buf);
    }
}
