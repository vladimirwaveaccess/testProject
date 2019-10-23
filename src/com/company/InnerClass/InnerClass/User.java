package com.company.InnerClass.InnerClass;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public class Query{
        public void printToLog() {
            System.out.println("User with login - \"" + getLogin() + "\" and password - \"" + getPassword() + "\" sent request");
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("login1", "password1");
        User.Query query1 = user.new Query();
        User.Query query2 = new User("login2", "password2").new Query();

        user.createQuery();
        query1.printToLog();
        query2.printToLog();
    }
}
