package com.itshaala;

import com.itshaala.model.Course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcAppInsertObject {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Course course = Course.builder()
                .courseId(101)
                .courseName("Java")
                .coursePrice(99)
                .build();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hibernate";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "insert into course(course_id, course_name, course_price) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, course.getCourseId());
        preparedStatement.setString(2, course.getCourseName());
        preparedStatement.setInt(3, course.getCoursePrice());
        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("Course object saved in the database");


    }
}
