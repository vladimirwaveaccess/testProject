package com.company.LS7OOP.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class GirlDemo {
    public static void main(String[] args) {
        TreeSet<Girl> girls1 = new TreeSet<>();
        TreeSet<Girl> girls2 = new TreeSet<>((a, b) -> a.name.compareTo(b.name));
        TreeSet<Girl> girls3 = new TreeSet<>(Comparator.comparing(a -> a.name));
        girls1.add(new Girl("Ket1", 19));
        girls1.add(new Girl("Ket2", 32));
        girls1.add(new Girl("Ket3", 18));
        girls1.add(new Girl("Ket4", 33));

        girls2.add(new Girl("Ket3", 19));
        girls2.add(new Girl("Ket2", 32));
        girls2.add(new Girl("Ket4", 18));
        girls2.add(new Girl("Ket1", 33));

        girls3.add(new Girl("Ket3", 19));
        girls3.add(new Girl("Ket2", 32));
        girls3.add(new Girl("Ket4", 18));
        girls3.add(new Girl("Ket1", 33));

        System.out.println(girls1);
        System.out.println();
        System.out.println(girls2);
        System.out.println();
        System.out.println(girls3);
    }
}
