package com.company.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFileToFile2Demo {
    //Creates a new file and then copies, if file exists then error message is displayed

    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("matrix.txt"), Paths.get("dest.txt"));
    }
}
