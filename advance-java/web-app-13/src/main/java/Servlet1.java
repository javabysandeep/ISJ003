import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/servlet1")
public class Servlet1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet1: init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet1: service");
        servletResponse.getWriter().println("Current time " + LocalDateTime.now());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Servlet1: destroy");
    }
}
