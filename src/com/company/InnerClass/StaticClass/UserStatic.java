package com.company.InnerClass.StaticClass;

import java.util.Objects;

public class UserStatic {
    private static String login;
    private static String password;

    public static void initialize(String login, String password) {
        UserStatic.login = login;
        UserStatic.password = password;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UserStatic.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserStatic.password = password;
    }

    @Override
    public String toString() {
        return "UserStatic{}";
    }

    public static class Query{
        public void printToLog() {
            System.out.println("User with login - \"" + getLogin() + "\" and password - \"" + getPassword() + "\" sent request");
        }
    }

    public static void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        Query query = new Query();
        initialize("login1", "password1");
        query.printToLog();
        createQuery();
    }
}
