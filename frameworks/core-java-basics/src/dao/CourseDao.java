package dao;

import model.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        save(course);

    }

    private static void save(Course course) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            String sql = "insert into course(id, course_name,price) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, course.getId());
            preparedStatement.setString(2, course.getName());
            preparedStatement.setInt(3, course.getPrice());
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {

            }
        }
        System.out.println("Course added successfully !");
    }

    public List<Course> getAllCourse() {
        return getCourses();
    }

    private static List<Course> getCourses() {
        List<Course> courseList = new ArrayList<>();

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from course";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Course course = Course.builder()
                        .id(resultSet.getInt(1))
                        .name(resultSet.getString(2))
                        .price(resultSet.getInt(3))
                        .build();
                courseList.add(course);
            }
        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {

            }
        }
        return courseList;
    }
}

