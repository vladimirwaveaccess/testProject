package com.company.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RemoveFileDemo {
    public static void main(String[] args) throws IOException {
        Path pathSource = Paths.get("dest.txt");
        Files.delete(pathSource);
    }
}
