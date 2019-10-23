package com.company.Files;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        System.out.println(new File("matrix.txt").getAbsoluteFile());
        System.out.println(new File("matrix.txt").getAbsolutePath());
        System.out.println(new File("matrix.txt").getName());
        System.out.println(new File("matrix.txt").lastModified());
        System.out.println(new File("matrix.txt").getPath());
    }
}
