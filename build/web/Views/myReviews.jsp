<%-- 
    Document   : myReviews
    Created on : Oct 31, 2024, 11:10:05 PM
    Author     : pedro
--%>
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <link rel="stylesheet" type="text/css" href="Footer.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>My Reviews!</h1>
        <br><!-- comment -->
        <a href="DirectPage?option=Main">Back</a><br>
        <c:import url="/Views/footer.jsp"/>
    </body>
</html>
