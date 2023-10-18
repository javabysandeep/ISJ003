package com.itshaala.ddl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Get Connection
        String url = "jdbc:mysql://localhost:3306/enquiry";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. create Statement
        Statement statement = connection.createStatement();

        //4. execute the query : create table query : DDL
        String createTableQuery = "create table oct_orders(id int, description varchar(100))";
        boolean status = statement.execute(createTableQuery);

        System.out.println("Table created " + status);

        //5. close the connection
        connection.close();
    }
}
