
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
        <script src="scripts/paintStars.js"></script>
        <title>My Reviews Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><br>
        <h1>My Reviews!</h1>
        <br><!-- comment -->
        <div class="myReviews">
            
            <ul id="ratingList"><c:forEach var="item" items="${reviews}"> 
                    <li data-rating="${item.getmyRating()}">
                        <img class="reviewimage" src="${item.getImage()}" alt="Shoe img">
                        <div class="sku"> Id:${item.getSku()} </div>
                        <div class="MyComments">
                        My Comments: ${item.getmyComment()}&emsp;
                        </div>
                        My Rating: ${item.getmyRating()}
                    </li> 
                </c:forEach> 
            </ul><!-- comment -->
        </div>
            
        <br><!-- comment -->
        <a href="DirectPage?option=Main">Home</a><br>
        
    </body>
    <c:import url="/Views/footer.jsp"/>
</html>
