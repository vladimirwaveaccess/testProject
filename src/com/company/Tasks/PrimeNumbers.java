package com.company.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 15;
        int i;
        int j = 10001;

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);

        while (primeNumbers.size() != j) {
            i = 2;

            if (checkNum(i, num)) {
                primeNumbers.add(num);
            }
            num += 2;
        }

        System.out.println("" + primeNumbers.get(j-1));
    }

    public static boolean checkNum(int count, int num) {
        boolean result = true;
        double countSteps = Math.sqrt(num);
        for (int i = count; i < countSteps+1; i++) {
            if (i == 2 || i == 3) {
                if (num % i == 0) {
                    return false;
                }
            }
            else if ((i % 2 != 0) && (i % 3 != 0)) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return result;
    }
}