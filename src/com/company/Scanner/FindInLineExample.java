package com.company.Scanner;

import java.util.Scanner;

public class FindInLineExample {
    public static void main(String[] args) {
        String inStr = "Name: Joe Age: 28 ID: 77";
        Scanner conIn = new Scanner(inStr);
        conIn.findInLine("Age:");
        if (conIn.hasNext()) {
            System.out.println(conIn.next());
        } else {
            System.out.println("Error!");
        }
    }
}
