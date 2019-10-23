package com.company.Serialisation;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student goncharenko = new Student("MMF", "Goncharenko", 1, "G017s9");
        File fw = new File("demo.dat");

        ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
        ostream.writeObject(goncharenko);
        ostream.close();

        Student.faculty = "GEO";

        File fr = new File("demo.dat");
        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
        Student unknown = (Student) istream.readObject();
        System.out.println(unknown);
    }
}
