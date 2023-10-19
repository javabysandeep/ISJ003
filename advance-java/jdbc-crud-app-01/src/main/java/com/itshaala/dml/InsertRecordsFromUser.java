package com.itshaala.dml;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordsFromUser {
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

        System.out.println("Enter the id and order desc");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String description = scanner.next();
        //4. execute the query : create table query : DDL
        String query = "insert into oct_orders (id ,description) values(" + id + "," + "'" + description + "');";
        statement.executeUpdate(query);
        System.out.println("Record Inserted");

        //5. close the connection
        connection.close();
    }
}
