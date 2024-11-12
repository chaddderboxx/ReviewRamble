<%-- 
    Document   : myReviews
    Created on : Oct 31, 2024, 11:10:05 PM
    Author     : pedro
--%>
<%@page import="RReview.Post"%>
<%@page import="RReview.PostModel"%>
<%@page import="java.util.ArrayList"%>
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
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><br>
        <h1>My Reviews!</h1>
        <br><!-- comment -->
        
        <ul> <c:forEach var="item" items="${posts}"> 
                <li>Shoe Id:${item.getShoeId()} My Rating:${item.getPRating()}   My Comments: ${item.getPComment()}</li> 
            </c:forEach> 
        </ul>
            
        <br><!-- comment -->
        <a href="DirectPage?option=Main">Home</a><br>
        
    </body>
    <c:import url="/Views/footer.jsp"/>
</html>
