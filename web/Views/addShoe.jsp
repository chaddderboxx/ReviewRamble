<%-- 
    Document   : addShoe
    Created on : Oct 31, 2024, 10:59:03 PM
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
        <script src="scripts/loadImage.js"></script>
        <script src="scripts/rating.js"></script>
        <title>Add Shoe Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <br><br>
        <h1>Your shoe review!</h1>
        <br>

        <form action="UploadShoe" method="post" enctype="multipart/form-data">
            <righS style="margin-top: 70px;">
                <h3>Upload a Shoe picture!</h3>
                <div id="data">
                    <input id="upImg" type="file" accept="image/*" name="file"><br><br>
                    <img class="shoeimage" id="img" src=${image} alt="Shoe Image" >
                </div><br>
            </righS>
               
            <leftS>
                
                <label >Brand: &emsp;&emsp;&emsp;</label>
                <input class="noManInput" type="text" name="brand" required value="${brand}"><br>
                <br>
                <label >Color: &emsp;&emsp;&emsp;</label>
                <input class="noManInput" type="text" name="colorS" required value="${colorS}"><br>
                <br><!-- comment -->
                <label >Name: &emsp;&emsp;&emsp;</label>
                <input class="noManInput" type="text" name="nameS" value="${nameS}" readonly="yes"><br>
                <br>
                <label >Sku: &emsp;&emsp;&emsp;</label>
                <input class="noManInput" type="text" name="sku" value="${sku}"><br>
                <br>
                <label >Rate the shoe: &emsp;&emsp;&emsp;</label>
                
                <div class="stars" id="starRating">
                    <span class="star" data-value="1">&#9733;</span>
                    <span class="star" data-value="2">&#9733;</span>
                    <span class="star" data-value="3">&#9733;</span>
                    <span class="star" data-value="4">&#9733;</span>
                    <span class="star" data-value="5">&#9733;</span>
                    
                    <input class="readonly" type="number" id="ratingField" name="rating" readonly="yes" />
                    <ratMax  >/ 5</ratMax>
                </div>
                <br>
                <label >Your Opinion &emsp;&emsp;&emsp;&nbsp;</label><br>
                 <textarea id="comments" name="comment" rows="10" cols="70" required></textarea>
                <br><br><br>
                
                <input type="hidden" name="action" value="createPost" />
                <input type="submit" class="button1" value="New Post" class="margin_left">
            </leftS>

        </form>
        <br><br>
        
        <a href="DirectPage?option=Main">Back</a><br>
    </body>
    <c:import url="/Views/footer.jsp"/>
</html>
