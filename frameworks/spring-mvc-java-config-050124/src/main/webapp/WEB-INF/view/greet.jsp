<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 05-01-2024
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<h2> Greetings of the day :</h2> <%=LocalDateTime.now()%>
<%
    out.println(request.getAttribute("data"));
%>
</body>
</html>
