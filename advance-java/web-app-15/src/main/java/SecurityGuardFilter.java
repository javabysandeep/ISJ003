import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "SecurityGuard", urlPatterns = {"/servlet1","/servlet2"})
public class SecurityGuardFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //pre-processing
        servletResponse.getWriter().println("Security Guard Check In");
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        if ("admin".equals(username) && "admin".equals(password)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(servletRequest, servletResponse);

        }
    }
}
