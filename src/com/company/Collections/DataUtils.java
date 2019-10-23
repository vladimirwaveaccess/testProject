package com.company.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataUtils {
    static ArrayList<String> name = new ArrayList<>(Arrays.asList("Ева", "Евгения", "Евдокия", "Евлалия", "Евпраксия", "Екатерина", "Елена", "Елизавета", "Епистима", "Ермиония"));
    static ArrayList<Integer> age = new ArrayList<>(Arrays.asList(22, 23, 24, 25, 26, 27, 28, 29, 30, 31));

    public static String getRandomName() {
        Collections.shuffle(name);
        return name.get(0);
    }

    public static Integer getRandomAge() {
        Collections.shuffle(age);
        return age.get(0);
    }
}
