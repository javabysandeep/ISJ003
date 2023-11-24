<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.IOException" %>
<html>
<body>
<h2>Scriptlet tag : it will be part of service method</h2>
<%
    printTable(request, response);
%>

<h2>Declaration tag : it will be part of class level</h2>
<%!
    public static void printTable(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 30; column++) {
                writer.print(row * column+"\t");
            }
            writer.println("<br>");
        }
    }
%>
</body>
</html>
