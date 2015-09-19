<%-- 
    Document   : Login
    Created on : 19 Sep, 2015, 3:39:51 AM
    Author     : Ritu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="./login.htm" method="POST">
            Username <input type="text" name="username" value=""  placeholder="Username"/>
            Password <input type="password" name="password" value="" placeholder="Password" />
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
