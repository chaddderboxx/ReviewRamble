<%-- 
    Document   : autent
    Created on : Oct 27, 2024, 12:11:40 AM
    Author     : pedro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <title>Login Page</title>
    </head>


    <body>
        <div>
            <header>
                <h1 class="TopTitle">Review Ramble</h1>
            </header>
        </div>
        <container>
            <leftS>
                <img src="images/GroupIcon.jpg" class="logo" alt="RambleLogo"/>
            </leftS>

            <righS>
                <h1> Login </h1><br><br>
                <form action="Login" method ="post">
                    <label >Username</label>
                    <input type="text" name="username" required><br>
                    <br>
                    <label >Password</label>
                    <input type="password" name="password" required><br>
                    <br>
                    <input type="hidden" name="action" value="autent">
                    <input type="submit" class="button1" value="Login" class="margin_left">
                </form>
                <br>
                <errorMes><c:out value= "${message}" /></<errorMes>
                        <br><br>
                <a href="index.html">Back</a>
            </righS>
        </container>        
        
    </body>

</html>
