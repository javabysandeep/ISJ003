import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/input")
public class ReadClientRequestDetails implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //reading the input
        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String mobile = servletRequest.getParameter("mobile");

        //writing the output
        PrintWriter writer = servletResponse.getWriter();
        writer.println("welcome " + name + "\t " + email + "\t" + mobile);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
