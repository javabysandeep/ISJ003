package com.itshaala.preparedStatementDemos;

import java.sql.*;
import java.util.Scanner;

public class DynamicQueriesUsingPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the actor first name and last name");
        String firstName = scanner.next();
        String lastName = scanner.next();

        //step 1 : load and register the driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : Get Connection
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3 : create the PreparedStatement object inorder to execute the query
        String query = "select actor_id, first_name, last_name from actor where first_name =? and last_name=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);


        //step 4: execute the query and store the result
        ResultSet resultSet = preparedStatement.executeQuery();

        //step 5 : read the records from the result set
        while (resultSet.next()) {
            String actorId = resultSet.getString("actor_id");
            String fName = resultSet.getString("first_name");
            String lName = resultSet.getString("last_name");
            System.out.println(actorId + "\t" + fName + "\t" + lName);
        }

        //step 6 : close the connection
        connection.close();
    }
}
