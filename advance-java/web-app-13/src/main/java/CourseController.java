import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/courses")
public class CourseController implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //get all courses from the database
        List<Course> courses = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
          connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from course");
            while (resultSet.next()) {
                Course course =
                        new Course(resultSet.getInt(1),
                                resultSet.getString(2),
                                resultSet.getInt(3));
                courses.add(course);
            }
        } catch (SQLException e) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //write the courses to the client
        PrintWriter writer = servletResponse.getWriter();
        writer.println(courses);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
