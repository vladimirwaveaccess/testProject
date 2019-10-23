package com.company.Files;

import java.io.File;
import java.util.Date;

public class WorkWithFileDemo {
    public static Date a;
    private static final String FileName = "matrix.txt";
    private static final String dirName = ".";//current directory
    private static File[] files;

    public static void main(String[] args) {
        File f1 = new File(FileName);
        if (!f1.exists()) {
            System.out.printf("File %s doesn't exist", f1.getAbsolutePath());
        }
        else {
            System.out.println("_________________ Work with file _________________");
            a = new Date(f1.lastModified());
            System.out.printf("File %s Date: %s Size: %d\n", f1.getName(), a.toString(), f1.length());
        }

        File d1 = new File(dirName);
        if (!d1.exists()) {
            System.out.printf("Dir %s doesn't exist", d1.getAbsolutePath());
        }
        else {
            if (d1.isDirectory())
                System.out.println("_____________ Work with directories ___________");
            System.out.println(d1.getName());
            files = d1.listFiles();
            for (File file : files) {
                if (file.isDirectory())
                    System.out.println(file.getName().toUpperCase());
                else
                    System.out.println(file.getName().toLowerCase());
            }
        }
    }
}
