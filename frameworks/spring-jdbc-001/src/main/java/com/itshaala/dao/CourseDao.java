package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        saveDataUsingSpringJdbc(course);
    }

    public void updateCourse(Course course) {
        String sql = "update course set course_name=?, price=? where id=?";
        jdbcTemplate.update(sql, (ps) -> {
            ps.setString(1, course.getCourseName());
            ps.setInt(2, course.getCoursePrice());
            ps.setInt(3, course.getCourseId());
        });
    }

    public void deleteCourseById(int courseId) {
        String sql = "delete from course where id=?";
        jdbcTemplate.update(sql, (ps) -> {
            ps.setInt(1, courseId);
        });
    }

    public List<Course> getAllCourses() {
        String sql = "select * from course";
        List<Course> courseList = jdbcTemplate.query(sql, (rs, rowNum) -> Course.builder()
                .courseId(rs.getInt("id"))
                .courseName(rs.getString("course_name"))
                .coursePrice(rs.getInt("price"))
                .build());
        return courseList;
    }

    public Course getCourseById(int courseId) {
        String sql = "select * from course where id=" + courseId;
        RowMapper<Course> rowMapper = (rs, rowNum) ->
                Course.builder()
                        .courseId(rs.getInt("id"))
                        .courseName(rs.getString("course_name"))
                        .coursePrice(rs.getInt("price"))
                        .build();
        Course course = jdbcTemplate.queryForObject(sql, rowMapper);
        return course;
    }

    private void saveDataUsingSpringJdbc(final Course course) {
        String sql = "insert into course(id,course_name,price) values(?,?,?)";
        jdbcTemplate.update(sql, (preparedStatement) -> {
            preparedStatement.setInt(1, course.getCourseId());
            preparedStatement.setString(2, course.getCourseName());
            preparedStatement.setInt(3, course.getCoursePrice());
        });
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
