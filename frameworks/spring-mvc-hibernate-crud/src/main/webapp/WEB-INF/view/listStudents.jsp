<%@ page import="com.itshaala.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 09-01-2024
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Students</title>
</head>
<body>
<table style="border: black solid 1px">
    <thead>
    <th>ID</th>
    <th>Name</th>
    <th>Phone</th>
    <th>Address</th>
    </thead>
    <%
        List<Student> studentList = (List<Student>) request.getAttribute("data");
        for (Student student : studentList) {

    %>
    <tr style="border: aqua">
        <td><%=student.getStudentId()%>
        </td>
        <td><%=student.getStudentName()%>
        </td>
        <td><%=student.getPhoneNumber()%>
        </td>
        <td><%=student.getAddress()%>
        </td>
    </tr>

    <%
        }
    %>

</table>
</body>
</html>
