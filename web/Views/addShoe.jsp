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
        <title>Add Shoe Page</title>
    </head>
    <body>
        <h1>Add Shoe!</h1>
        <br>
            
        <form action="UploadShoe" method="post" enctype="multipart/form-data">
            <h3>Upload a Shoe picture!</h3>
            <div id="data">
                <input id="upImg" type="file" accept="image/*" name="file">
                <img id="img" src="images/genShoe.gif" alt="Shoe Image" width="340" height="auto">
            </div><br>
            <label >Brand &emsp;&emsp;&emsp;</label>
            <input type="text" name="brand" required><br>
            <br>
            <label >Color &emsp;&emsp;&emsp;</label>
            <input type="text" name="sColor" required><br>
            <br><!-- comment -->
            <label >Type &emsp;&emsp;&emsp;</label>
            <input type="text" name="type" required><br>
            <br>
            <div id="buttons">
                <label>&nbsp;</label>
                <input type="submit" value="UploadShoe"><br>
            </div>
        </form>
        <h1>Post!</h1>
        <form action="Post" method ="post">
            <label >Rating &emsp;&emsp;&emsp;</label>
            <input type="int" name="rating" required><br>
            <br>
            <label >Your Opinion &emsp;&emsp;&emsp;&nbsp;</label>
            <input type="text" name="comment" required><br>
            <br>
            <input type="hidden" name="action" value="createPost" />
            <input type="submit" class="button1" value="New Post" class="margin_left">
            
            
        </form>
        <a href="DirectPage?option=Main">Back</a><br>
    </body>
</html>
