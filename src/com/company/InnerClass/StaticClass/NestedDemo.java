package com.company.InnerClass.StaticClass;

import static com.company.InnerClass.StaticClass.UserStatic.*;

public class NestedDemo {
    public static void main(String[] args) {
        UserStatic.Query query = new UserStatic.Query();
        initialize("login1", "password1");
        query.printToLog();

        createQuery();
    }
}
