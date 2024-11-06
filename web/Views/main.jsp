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
        <script src="scripts/main.js"></script>
        <script src="scripts/apiData.js"></script>
        <title>Main Ramble Page</title>
    </head>
    <body>
        <h1>Main Page!</h1>

        <a href="DirectPage?option=About">About</a><br>
        <a href="DirectPage?option=MyReview">My Reviews</a><br>
        <a href="Search">Search</a><br>
        
         
        <a href="#" id="post">Post Comment and Rating</a><br>
        <a href="DirectPage?option=Contact">Contact</a><br>
        <a href="DirectPage?option=Profile">Profile</a><br>
        <a href="SignOut">Sign Out</a><br>
        <br><!-- comment -->
        <div id="myPopup" class="popup">
            <p>Rate a new shoe or an already rated one!</p>
            <button id="newShoe">New Shoe</button>
            <button id="existShoe">Existing Shoe</button>
            <button id="closePopUp">Close</button>
        </div>
        
    <c:import url="/Views/footer.jsp"/> 
</body>
</html>
