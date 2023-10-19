package com.itshaala;

import java.sql.*;
import java.util.Scanner;

public class SQLInjection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Enter the actor first name");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.println("Enter the actor last name");
        String lastName = scanner.next();

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
        String query = "select actor_id, first_name, last_name from actor where first_name ='" + firstName + "' and last_name='" + lastName + "'or 1=1";
        ResultSet resultSet = statement.executeQuery(query);

        //step 5 : read the records from the result set
        while (resultSet.next()) {
            int actorId = resultSet.getInt("actor_id");
            String fName = resultSet.getString("first_name");
            String lName = resultSet.getString("last_name");
            System.out.println(actorId + "\t" + fName + "\t" + lName);
        }

        //step 6 : close the connection
        connection.close();

    }
}
