<%-- 
    Document   : about
    Created on : Oct 27, 2024, 8:03:26 PM
    Author     : pedro
--%>
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <link rel="stylesheet" type="text/css" href="Footer.css">
        <title>JSP Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><br>
        <h1>About</h1>
        <div class="about-container"> 
            <div class=leftS>
                <img src="images/About.jpg" class="logo" alt="AboutImage"/>
                <h6>https://mondo.shoes/wp-content/uploads/2018/01/buy-shoes-0.jpg</h6>

            </div>
            <div class=righS>
                <p>The goal of this project is to provide a space where people
                    can comment and review comments and ratings about shoes.
                    Specifically, the goal of this project is to create a space
                    that will allow a user to have information about the consumer’s 
                    experience with purchased shoes.   
                    In the future that user may be compensated economically based 
                    on other people’s comments and likes.
                </p>
            </div>
            <br><br>
        </div>    
        <a href="DirectPage?option=Main">Back</a><br>
        <c:import url="/Views/footer.jsp"/>
    </body>
    
</html>

