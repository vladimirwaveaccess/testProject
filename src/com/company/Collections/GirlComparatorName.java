package com.company.Collections;

import java.util.Comparator;

public class GirlComparatorName implements Comparator<Girl> {
    @Override
    public int compare(Girl girl1, Girl girl2) {
        return girl1.getName().compareTo(girl2.getName());
    }
}
