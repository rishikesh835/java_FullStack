<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>MVC Web Application</title>
</head>
<body bgcolor ='cyan' style="align-content: center">
    <a href="hello-servlet">hello world!</a>
<h2>Kindly Register to proceed further!</h2>
<form method="post" action="./Register">

    <table>
        <tr>
            <td> User Name </td>
            <td> <input type="text" name="uname"> </td>
        </tr>

        <tr>
            <td> User Email id </td>
            <td> <input type="text" name="email"> </td>
        </tr>

        <tr>
            <td> User Password </td>
            <td> <input type="password" name="password"> </td>
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