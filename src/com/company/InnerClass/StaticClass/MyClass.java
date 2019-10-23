package com.company.InnerClass.StaticClass;

public class MyClass {
    String myClass = "my Class";

    public void show() {
        System.out.println(myClass);
    }

    public static class MyNestedClass {
        String myNestedClass = "my Nested Class";

        public void show() {
            System.out.println(myNestedClass);
        }
    }
}
