import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        resp.setContentType("text/html");
        httpSession.invalidate();
        PrintWriter writer = resp.getWriter();
        writer.println("<h1 style='color:green'> Logout Successfully. Please login again</h1>");
        RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
        dispatcher.include(req, resp);
    }
}
