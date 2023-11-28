<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Exception Handler</title>
</head>
<body>
<h2 style="color: red">
    <%
        exception.printStackTrace();
        out.println(exception.getMessage());
    %>
</h2>
</body>
</html>
