package com.company.String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = appendString(3, 56);
        System.out.println(stringBuilder1);
//        System.out.println(appendString(5, 8));

        System.out.println(replace(stringBuilder1, "=", "equals"));
        System.out.println(replaceReplace(stringBuilder1, "*", "multiply"));
    }

    public static StringBuilder appendString(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        stringBuilder.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return stringBuilder;
    }

    public static StringBuilder replace(StringBuilder stringBuilder, String subString, String replaceString) {
        int pos;
        while ((pos = stringBuilder.indexOf(subString)) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, replaceString);
        }
        return stringBuilder;
    }

    public static StringBuilder replaceReplace(StringBuilder stringBuilder, String subString, String replaceString) {
        int pos;
        while ((pos = stringBuilder.indexOf(subString)) != -1) {
            stringBuilder.replace(pos, pos + subString.length(), replaceString);
        }
        return stringBuilder;
    }
}
