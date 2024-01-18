package com.itshaala.preparedStatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertIntoUsingPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Course course = acceptCourseDetails();

        //step 1 : load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2: get connection
        String url = "jdbc:mysql://localhost:3306/institute_mgmt_app";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3 : create the prepared statement object
        String query = "insert into course(course_id, course_name, course_duration,course_content, intake, course_price) values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, course.getCourseId());
        preparedStatement.setString(2, course.getCourseName());
        preparedStatement.setString(3, course.getCourseDuration());
        preparedStatement.setString(4, course.getCourseContent());
        preparedStatement.setInt(5, course.getCourseIntake());
        preparedStatement.setInt(6, course.getCoursePrice());

        //step 4 : execute the query
        preparedStatement.executeUpdate();
        System.out.println("Record inserted successfully");

        //step 5 : close the connection
        connection.close();


    }

    private static Course acceptCourseDetails() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course id");
        int courseId = scanner.nextInt();

        System.out.println("Enter the course name");
        String courseName = scanner.next();

        System.out.println("Enter the course duration");
        String courseDuration = scanner.next();

        System.out.println("Enter the course content");
        String courseContent = scanner.next();

        System.out.println("Enter the course Intake");
        int courseIntake = scanner.nextInt();

        System.out.println("Enter the course Price");
        int coursePrice = scanner.nextInt();

        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setCourseContent(courseContent);
        course.setCourseDuration(courseDuration);
        course.setCourseIntake(courseIntake);
        course.setCoursePrice(coursePrice);

        return course;
    }
}
