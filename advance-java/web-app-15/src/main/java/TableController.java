import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/table")
public class TableController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<table style='border:1px solid'>");
        for (int i = 1; i <= 10; i++) {
            writer.println("<tr style='border:1px solid'>");
            for (int j = 1; j <= 10; j++) {
                writer.print("<td>" + i * j + "</td>");
            }
            writer.println("</tr>");
        }
        writer.println("</table>");
    }
}
