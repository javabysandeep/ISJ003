package controller;


import model.Course;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HelloController implements Servlet {
    public HelloController() {
        System.out.println("controller.HelloController : constructor");
    }

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("controller.HelloController : init");
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("controller.HelloController: service");

        //send response to the client
        PrintWriter writer = servletResponse.getWriter();
       // writer.println("<h1>Hello, Greetings of the Day ..</h1>" + LocalDateTime.now());

        //get the list of courses and send to the client
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from course");
            List<Course> courseList = new ArrayList<>();
            while (resultSet.next()) {
                Course course = new Course();
                course.setCourseId(resultSet.getInt("id"));
                course.setCourseName(resultSet.getString("course_name"));
                course.setCoursePrice(resultSet.getInt("price"));
                courseList.add(course);
            }
            writer.println(courseList);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
        System.out.println("controller.HelloController: destroy");
    }

    public ServletConfig getServletConfig() {
        return null;
    }


    public String getServletInfo() {
        return null;
    }


}
