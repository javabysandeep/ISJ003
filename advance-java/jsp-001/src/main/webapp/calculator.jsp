<%@ page import="java.io.PrintWriter" errorPage="exceptionHandler.jsp" %>
<html>
<body>
<h2>Scriptlet tag : it will be part of service method</h2>
<%
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator.html");
    requestDispatcher.include(request,response);

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
