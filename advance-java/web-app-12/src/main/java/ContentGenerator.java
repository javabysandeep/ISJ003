import javax.servlet.*;
import java.io.IOException;

public class ContentGenerator implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ContentGenerator:init");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ContentGenerator:service");
        servletResponse.getWriter().println("Response from Web App: " + System.currentTimeMillis());
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("ContentGenerator:destroy");
    }
}
