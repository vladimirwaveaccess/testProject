package com.company.String;

import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        printStudent("Ivanov", 5, "Mathematics");
        printStudent("Petrov", 4, "Physics");
    }

    private static void printStudent(String fullName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Student %15s got %3d for %15s", fullName, mark, subject);
        System.out.println(formatter);
    }
}
