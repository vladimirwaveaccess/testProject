package com.company.InnerClass.StaticClass;

import com.company.InnerClass.StaticClass.MyClass;

public class MyClassDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show();

        MyClass.MyNestedClass b = new MyClass.MyNestedClass();
        b.show();
    }
}
