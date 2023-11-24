<%@ page import="java.io.PrintWriter" %>
<html>
<body>
<h2>Scriptlet tag : it will be part of service method</h2>
<%
    PrintWriter writer = response.getWriter();
    for (int i = 1; i <= 100; i++) {
        writer.println(i);
    }
%>
</body>
</html>
