package com.itshaala;

import com.itshaala.model.Course;

import java.sql.*;

public class JdbcAppReadObject {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hibernate";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "select * from course where course_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, 101);
        ResultSet resultSet = preparedStatement.executeQuery();
        Course course = new Course();
        while (resultSet.next()) {
            course.setCourseId(resultSet.getInt("course_id"));
            course.setCourseName(resultSet.getString("course_name"));
            course.setCoursePrice(resultSet.getInt("course_price"));
        }
        connection.close();
        System.out.println(course);


    }
}
