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
        <title>Add Shoe Page</title>
    </head>
    <body>
        <h1>Add Shoe!</h1>
        <br>
        <form action="Login" method ="post">
                    <label >Brand &emsp;&emsp;&emsp;</label>
                    <input type="text" name="brand" required><br>
                    <br>
                    <label >Color &emsp;&emsp;&emsp;</label>
                    <input type="text" name="sColor" required><br>
                    <br><!-- comment -->
                    <label >Type &emsp;&emsp;&emsp;</label>
                    <input type="text" name="type" required><br>
                    <br>
                    
                    
                    
                    <br>
                    <input type="hidden" name="action" value="createShoe" />
                    <input type="submit" class="button1" value="New Shoe" class="margin_left">

                </form>
        
        
        
        <a href="DirectPage?option=Main">Back</a><br>
    </body>
</html>
