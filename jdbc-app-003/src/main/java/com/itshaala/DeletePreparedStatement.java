package com.itshaala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course id");
        int courseId = scanner.nextInt();

        //step 1 : load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2: get connection
        String url = "jdbc:mysql://localhost:3306/institute_mgmt_app";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3 : create the prepared statement object
        String query = "delete from course where course_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, courseId);

        //step 4 : execute the query
        preparedStatement.executeUpdate();
        System.out.println("Record Deleted successfully");

        //step 5 : close the connection
        connection.close();


    }


}
