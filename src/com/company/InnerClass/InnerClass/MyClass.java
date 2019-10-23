package com.company.InnerClass.InnerClass;

public class MyClass {
    String myClass = "my Class";

    public void show() {
        System.out.println(myClass);
    }

    public class MyInnerClass {
        String myInnerClass = "my Inner Class";
        int b = 10;

        public void show() {
            System.out.println(myInnerClass);
        }
    }
}
