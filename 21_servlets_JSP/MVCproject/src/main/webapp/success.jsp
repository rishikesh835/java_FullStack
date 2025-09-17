<%--
  Created by IntelliJ IDEA.
  User: rishi
  Date: 16-09-2025
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration successfull</title>
</head>
<body>
    <marquee>Registration Successfull</marquee>
    <% String name = (String) session.getAttribute("name"); %>Registraion successfull
    <h2>Congratulations <%=name%> on successfull registration</h2>
</body>
</html>
