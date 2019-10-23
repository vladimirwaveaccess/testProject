package com.company.Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class GirlTreeSetDemo {
    public static void main(String[] args) {
        //First option of Comparator realisation
        Comparator<Girl> nameComparator = (a1, a2) -> a1.getName().compareTo(a2.getName());
        TreeSet<Girl> girls1 = new TreeSet<>(nameComparator);
        girls1.add(new Girl("Kate", 25));
        girls1.add(new Girl("Julia", 21));
        girls1.add(new Girl("Anna", 24));
        System.out.println(girls1);
        System.out.println();

        //Second option of Comparator realisation
        TreeSet<Girl> girls2 = new TreeSet<>(new GirlComparatorName());
        girls2.add(new Girl("Kate", 25));
        girls2.add(new Girl("Julia", 21));
        girls2.add(new Girl("Anna", 24));
        System.out.println(girls2);
    }
}
