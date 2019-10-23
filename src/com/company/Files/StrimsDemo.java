package com.company.Files;

import java.io.*;

public class StrimsDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream st = new FileInputStream("matrix.txt");
        System.out.println("__________________ Work with streams _______________");
        while (st.available() != 0) {
            int b = st.read();
            char ch = (char) b;
            System.out.print(ch);
        }
        st.close();

        FileOutputStream so = new FileOutputStream("out.txt");
        String d = "Hello";
        byte[] bytes = d.getBytes();
        so.write(bytes);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("matrix.txt"));
        String s = null;
        System.out.println();

        System.out.println("_________________ Work with BufferedReader ____________");
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
        reader.close();
        PrintWriter write = new PrintWriter("out1.txt");
        write.printf("%s %d %c", "String", 100, 'q');
        write.close();
    }
}
