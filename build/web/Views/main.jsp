<%-- 
    Document   : main
    Created on : Oct 27, 2024, 8:01:28 PM
    Author     : pedro
--%>
<%@page import="RReview.User"%>
<%@page import="RReview.Shoe"%>
<%@page import="RReview.UserModel"%>
<%@ page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <title>Main Ramble Page</title>
    </head>
    <body>
        <h1>Main Page!</h1>
        
        <a href="DirectPage?option=About">About</a><br>
        <a href="DirectPage?option=MyReview">My Reviews</a><br>
        <a href="DirectPage?option=Search">Search</a><br>
        <a href="DirectPage?option=AddShoe">Add a Shoe</a><br>
        <a href="DirectPage?option=Post">Post</a><br> 
        <a href="DirectPage?option=Contact">Contact</a><br>
        <a href="DirectPage?option=Profile">Profile</a><br>
        <a href="SignOut">Sign Out</a><br>
        <br><!-- comment -->
        
        <c:import url="/Views/footer.jsp"/> 
    </body>
</html>
