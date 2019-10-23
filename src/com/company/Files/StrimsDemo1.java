package com.company.Files;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class StrimsDemo1 {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream("matrix.txt");

        readFullyByByte(inFile);
        System.out.print("\n\n\n");

        InputStream inUrl = new URL("http://google.com").openStream();

        readFullyByByte(inUrl);
        System.out.print("\n\n\n");

        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69});
        readFullyByByte(inArray);
        System.out.print("\n\n\n");
    }

    private static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
