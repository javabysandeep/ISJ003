package com.itshaala.preparedStatementDemos;

import java.sql.*;
import java.util.Scanner;

public class FilterActors {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Enter the actor name");
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.next();

        //step 1 : load and register the driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : Get Connection
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3 : create the statement object inorder to execute the query
        Statement statement = connection.createStatement();

        //step 4: execute the query and store the result
        String query = "select actor_id, first_name, last_name from actor where first_name like '" + actorName + "%'";
        ResultSet resultSet = statement.executeQuery(query);

        //step 5 : read the records from the result set
        while (resultSet.next()) {
            int actorId = resultSet.getInt("actor_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            System.out.println(actorId + "\t" + firstName + "\t" + lastName);
        }

        //step 6 : close the connection


    }
}
