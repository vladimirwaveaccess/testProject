package com.company.InnerClass.InnerClass;

public class MyClassDemo {
    public static void main(String[] args) {
        MyClass.MyInnerClass c = new MyClass().new MyInnerClass();
        c.show();
    }
}
