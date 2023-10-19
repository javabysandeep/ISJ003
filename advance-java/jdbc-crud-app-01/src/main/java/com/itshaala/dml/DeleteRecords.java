package com.itshaala.dml;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
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

        //4. execute the query : delete - dml
        String query = "delete from oct_orders where id=3";
        statement.executeUpdate(query);
        System.out.println("Record Deleted");

        //5. close the connection
        connection.close();
    }
}
