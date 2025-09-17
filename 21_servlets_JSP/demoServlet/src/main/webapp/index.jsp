<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body bgcolor ='cyan' style="align-content: center">
<h1><%= "Hello World!" %>
</h1>
<marquee>This is first servlet project created in InteliiJ Idea</marquee>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<h1>Welcome to our Second Webapp</h1>
<h2>Kindly Register to proceed further!</h2>
<form  method="post" action="./formServlet">

    <table>
        <tr>
            <td> User Name </td>
            <td> <input type="text" name="uname"> </td>
        </tr>

        <tr>
            <td> User City </td>
            <td> <input type="text" name="ucity"> </td>
        </tr>

        <tr>
            <td> <input type="submit" value="SignUp"> </td>
        </tr>
    </table>

</form>
</body>
</html>