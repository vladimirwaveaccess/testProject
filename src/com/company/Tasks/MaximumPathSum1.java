package com.company.Tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MaximumPathSum1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer[]> matrix = new ArrayList<>();
        FileReader fr = new FileReader("matrix.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            matrix.add(getInteger(scan.nextLine().split(" ")));
        }
        System.out.println(matrix);
        int sizeMatrix = matrix.size();
        String[] massive = new String[15];
        i = 0;
//        for (String[] mat: matrix) {
//            i = mat.length;
//            System.out.println(i);
//        }
    }

    public static Integer[] getInteger(String[] strings) {
        Integer[] integers = new Integer[strings.length];
        int i = 0;

        for (String string : strings) {
            integers[i] = Integer.valueOf(string);
            i++;
        }
        return integers;
    }
}
