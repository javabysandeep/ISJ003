import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/login")
public class LoginController extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // read the input sent by the client
        servletResponse.setContentType("text/html");
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        // validate the input with database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/it_shaala";
            String dbUsername = "root";
            String dbPassword = "root";
            Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            String sqlQuery = "select username, password from user_tbl where username=? AND password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            String databaseUsername = null;
            String databasePassword = null;

            while (resultSet.next()) {
                databaseUsername = resultSet.getString("username");
                databasePassword = resultSet.getString("password");
            }
            if (username.equals(databaseUsername) && password.equals(databasePassword)) {
                //welcome
                RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("welcome");
                dispatcher.forward(servletRequest, servletResponse);

            } else {
                //login
                PrintWriter writer = servletResponse.getWriter();
                writer.println("<h2 style='color:red'>Invalid Credentials</h2>");
                RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("index.jsp");
                dispatcher.include(servletRequest, servletResponse);
            }

        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        // if success -> welcome

        //if fail - login
    }
}
