<%@ page import="java.io.PrintWriter" %>
<html>
<body>
<h2>Scriptlet tag : it will be part of service method</h2>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    switch (operation) {
        case "+":
            out.println(number1 + number2);
            break;
        case "-":
            out.println(number1 - number2);
            break;
        case "*":
            out.println(number1 * number2);
            break;
        case "/":
            out.println(number1 / number2);
            break;
        case "%":
            out.println(number1 % number2);
            break;
        default:
            out.println("invalid operator");
            break;
    }
%>
</body>
</html>
