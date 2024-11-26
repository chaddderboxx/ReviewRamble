<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <link rel="stylesheet" type="text/css" href="Footer.css">
        <link rel="stylesheet" type="text/css" href="header.css">
        <link rel="stylesheet" type="text/css" href="contact.css">
        <title>Contact Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><!-- comment -->
        <br>
        <div class="about-container">
            <div class="leftS">
                <img src="images/GroupIcon.jpg" class="logo" alt="RambleLogo"/>
            </div>
            <div class="righS">
                <form action="UpdateContact" method ="post">
                    <h1>Contact!</h1>
                    <!--VC Changed to place holder so the labels appear inside the input boxes-->
                    <input type="text" name="contactName" placeholder="Name: " required><br>
                    <br>

                    <input type="email" name="contactEmail" placeholder="Email: "><br>
                    <br>
                    <!--VC Changed to textarea for multiline input-->
                    <textarea name="contactMessage" placeholder="Message: " required></textarea><br>
                    <br>
                    <input type="hidden" name="action" value="contact" />
                    <input type="submit" class="button1" value="submit" class="margin_left">

                </form>
            </div>
        </div>
    </body>
    <br>
    <c:import url="/Views/footer.jsp"/>
</html>

