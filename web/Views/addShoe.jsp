<%-- 
    Document   : addShoe
    Created on : Oct 31, 2024, 10:59:03 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <script src="scripts/loadImage.js"></script>
        <script src="scripts/rating.js"></script>
        <title>Add Shoe Page</title>
    </head>
    <body>
        <h1>Your shoe review!</h1>
        <br>

        <form action="UploadShoe" method="post" enctype="multipart/form-data">
            <righS style="margin-top: 70px;">
                <h3>Upload a Shoe picture!</h3>
                <div id="data">
                    <input id="upImg" type="file" accept="image/*" name="file" required><br><br>
                    <img class="shoeimage" id="img" src="images/genShoe.gif" alt="Shoe Image" >
                </div><br>
            </righS>
            <leftS>
                <label >Brand &emsp;&emsp;&emsp;</label>
                <input type="text" name="brand" required><br>
                <br>
                <label >Color &emsp;&emsp;&emsp;</label>
                <input type="text" name="sColor" required><br>
                <br><!-- comment -->
                <label >Type &emsp;&emsp;&emsp;</label>
                <input type="text" name="type" required><br>
                <br>
                <label >Rate the shoe: &emsp;&emsp;&emsp;</label>
                
                <div class="stars" id="starRating">
                    <span class="star" data-value="1">&#9733;</span>
                    <span class="star" data-value="2">&#9733;</span>
                    <span class="star" data-value="3">&#9733;</span>
                    <span class="star" data-value="4">&#9733;</span>
                    <span class="star" data-value="5">&#9733;</span>
                    
                    <input class="readonly" type="number" id="ratingField" name="rating" readonly />
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
</html>
