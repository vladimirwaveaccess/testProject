package com.company.DataBase;

import java.sql.*;
import java.util.ArrayList;

public class ConnectionToDBDemo {
    public static void main(String[] args) throws SQLException {
        ArrayList<User> users = new ArrayList<>();
        Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "");
        Connection connection2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mysql", "root", "");
        System.out.println("connection");
        Statement statement = connection1.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from users");
        while (resultSet.next()) {
            users.add(new User(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4)));
        }
        System.out.println(resultSet);
        connection1.close();
    }
}
