
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <link rel="stylesheet" type="text/css" href="Footer.css">
        <script src="scripts/paintStars.js"></script>
        <title>JSP Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><br>
        <h1>The Reviews!</h1>
        <br><!-- comment -->
        <div class="myReviews">
            <img class="shoeimage" src="${reviews[0].getImage()}" alt="Shoe img">
            ${reviews[0].getBrand()}
            &emsp;${reviews[0].getsTitle()}
            &emsp; Id:${reviews[0].getSku()} <br>
            <ul id="ratingList"><c:forEach var="item" items="${reviews}"> 
                    <li data-rating="${item.getmyRating()}">
                        <div class="MyComments">
                            Comment: ${item.getmyComment()}
                        </div>
                        Rating: ${item.getmyRating()}
                    </li> 
                </c:forEach> 
            </ul>
        </div>

        <br>
    </body>
    <c:import url="/Views/footer.jsp"/>  
</html>
