package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class CourseDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        saveDataUsingSpringJdbc(course);
    }

    private void saveDataUsingSpringJdbc(Course course) {
        jdbcTemplate.update("");
    }

    private void saveDataUsingTraditinalJdbc(Course course) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "insert into course(id, course_name, price) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, course.getCourseId());
            preparedStatement.setString(2, course.getCourseName());
            preparedStatement.setInt(3, course.getCoursePrice());
            preparedStatement.executeUpdate();
            System.out.println("Successfully saved the course");
        } catch (SQLException e) {
            System.out.println("connection issue");
        }
    }
}
