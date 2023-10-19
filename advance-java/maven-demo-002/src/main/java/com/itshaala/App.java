package com.itshaala;

import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/sakila";
        String query = "select actor_id, first_name, last_name from actor where first_name like 'S%'";

        //step 1 : Load the Driver class provided by the vendor and register
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step 2: get connection
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3 :
        Statement statement = connection.createStatement();

        //step 4 : execute query
        ResultSet resultSet = statement.executeQuery(query);

        //step 5 : use the result
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("actor_id") + "\t" +
                    resultSet.getString("first_name") + "\t" +
                    resultSet.getString("last_name")
            );
        }

        //step 6 : close connection
        connection.close();
    }
}
