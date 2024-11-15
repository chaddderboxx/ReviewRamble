
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <link rel="stylesheet" type="text/css" href="Footer.css">
        <title>Contact Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><!-- comment -->
        <br>
        <h1>Contact!</h1>
        <div class="about-container"> 
        <leftS>
                <img src="images/GroupIcon.jpg" class="logo" alt="RambleLogo"/>
        </leftS>
         <righS>
            <form action="Contact" method ="post">
                        <label >Name &emsp;&emsp;&emsp;</label>
                        <input type="text" name="contactName" required><br>
                        <br>
                        <label >Email &emsp;&emsp;&emsp;&nbsp;</label>
                        <input type="email" name="contactEmail" required><br>
                        <br>
                        <label >Message</label>
                        <input type="textbox" name="contactMessage" required><br>
                        <br>
                        <input type="hidden" name="action" value="contact" />
                        <input type="submit" class="button1" value="submit" class="margin_left">

            </form>
        </righS>
    </div>
    </body>
    <br><br><br><br>
    <c:import url="/Views/footer.jsp"/>
</html>
