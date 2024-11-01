<%-- 
    Document   : post
    Created on : Oct 29, 2024, 9:30:12 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <title>JSP Page</title>
    </head>
    <body>
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
