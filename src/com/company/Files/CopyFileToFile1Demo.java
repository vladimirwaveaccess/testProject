package com.company.Files;

import java.io.*;

public class CopyFileToFile1Demo {
    private static final String sourceFileName = "matrix.txt";
    private static final String destFileName = "dest.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
        PrintWriter write = new PrintWriter(destFileName);

        String s = null;
        int words = 0, lines = 0, chars = 0;
        while ((s = reader.readLine()) != null) {
            lines++;
            String[] ws = s.trim().split("\\s+");//\\s+ - любое количество пробелов
            words += ws.length;
            for (String w : ws)
                chars += w.length();
            write.println(s.toUpperCase());
        }
        reader.close();
        write.close();
        System.out.printf("Copied chars - %d; words - %d; lines - %d\n", chars, words, lines);
    }
}
