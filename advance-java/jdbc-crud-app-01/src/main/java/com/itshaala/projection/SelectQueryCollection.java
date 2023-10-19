package com.itshaala.projection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectQueryCollection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 1 : load and register the driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : Get Connection
        String url = "jdbc:mysql://localhost:3306/enquiry";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3 : create the statement object : to execute the query
        Statement statement = connection.createStatement();

        //step 4. execute the query : DQL : select
        String query = "select * from oct_orders";
        ResultSet resultSet = statement.executeQuery(query);

        //step 5: read the rows from the resultset object
        List<Order> orderList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String description = resultSet.getString("description");
            Order order = new Order(id, description);
            orderList.add(order);
        }
        System.out.println(orderList);

        //step 5: close the connection
        connection.close();

    }
}
