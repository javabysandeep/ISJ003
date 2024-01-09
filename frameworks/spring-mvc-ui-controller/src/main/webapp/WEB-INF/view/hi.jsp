<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 08-01-2024
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi User</title>
</head>
<body>

Hi, <%=request.getAttribute("username")%> <br><br>
</body>
</html>
