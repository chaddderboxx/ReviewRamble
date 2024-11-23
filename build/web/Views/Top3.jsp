<%-- 
    Document   : Reviews
    Created on : Nov 15, 2024, 11:36:13 PM
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
        <link rel="stylesheet" type="text/css" href="header.css">
        <script src="scripts/paintStars.js"></script>
        <title>Shoes Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><br>
        <h1>Top 3 Shoes!</h1>
        <br><!-- comment -->
        <div class="myReviews">
            
            <ul id="ratingList">
                    
                <c:forEach var="i" begin="0" end="2">
                    
                    <c:set var="item" value="${shoes[i]}"/>
                    <li data-rating="${item.getRating()}">
                        <img class="reviewimage" src="${item.getFilename()}" alt="Shoe img">
                        <div class="sku">${item.getBrand()}</div>
                        <div class="sku">Id:${item.getSku()} </div>
                        <form action="CommByShoe" method="GET">
                            <input type="hidden" name="shoeIdInfo" value="${item.getId()}">
                            <button class="button1"   >Reviews</button>
                        </form>
                        Rating: ${item.getRating()}
                    </li> 
                </c:forEach> 
            </ul><!-- comment -->
        </div>
            
        <br>
    </body>
     <c:import url="/Views/footer.jsp"/>        
</html>
