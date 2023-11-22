import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //read the form input
        final String username = req.getParameter("username");
        final String password = req.getParameter("password");

        //validate the credentials with the backend
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String dbUsername = "root";
            String dbPassword = "root";
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            String sql = "select username,password from user_tbl where username=? and password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            String usernameFromDatabase = null;
            String passwordFromDatabase = null;
            while (resultSet.next()) {
                usernameFromDatabase = resultSet.getString("username");
                passwordFromDatabase = resultSet.getString("password");
            }
            if (username.equals(usernameFromDatabase) && password.equals(passwordFromDatabase)) {
                HttpSession httpSession = req.getSession(true);
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", password);
                RequestDispatcher dispatcher = req.getRequestDispatcher("welcome");
                dispatcher.forward(req, resp);
            } else {
                PrintWriter writer = resp.getWriter();
                writer.println("<h1 style='color:red'> Invalid Credentials</h1>");
                RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
                dispatcher.include(req, resp);
            }

        } catch (ClassNotFoundException ignored) {
        } catch (SQLException ignored) {
        }
    }
}
