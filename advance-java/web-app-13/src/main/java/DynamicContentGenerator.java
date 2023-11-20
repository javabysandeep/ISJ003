import javax.servlet.*;
import java.io.IOException;
import java.time.LocalDateTime;

public class DynamicContentGenerator implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("DynamicContentGenerator: init()");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("DynamicContentGenerator: service()");
        servletResponse.getWriter().println("Current time " + LocalDateTime.now());
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("DynamicContentGenerator: destroy()");
    }
}
