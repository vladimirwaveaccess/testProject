package com.company.Scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
    private static String filename = "scan.txt";

    public static void scanFile() {
        try {
            FileReader fr = new FileReader(filename);
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    System.out.println(scanner.nextInt() + " : int");
                } else {
                    if (scanner.hasNextDouble()) {
                        System.out.println(scanner.nextDouble() + " : double");
                    } else {
                        if (scanner.hasNextBoolean()) {
                            System.out.println(scanner.nextBoolean() + " : boolean");
                        } else {
                            System.out.println(scanner.next() + " : String");
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }

    public static void makeFile() {
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write("2 Java 1,5 true 1.6 ");
            fw.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        ScannerExample.makeFile();
        ScannerExample.scanFile();
    }
}
