package com.company.Files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    private static final String sourceFileName = "dest.txt";

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(sourceFileName, "rw");
        System.out.println(raf.length());
        raf.seek(10);
        String s = raf.readLine();
        System.out.println(s);
        raf.seek(raf.length());
        raf.writeUTF("hello");
        raf.close();
    }
}
