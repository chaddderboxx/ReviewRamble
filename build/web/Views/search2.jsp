
<%@page import="RReview.Shoe"%>
<%@page import="RReview.ShoeModel"%>
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        
        <script src="scripts/apiData.js"></script>
        <title>Search Page</title>
    </head>
    <body>
        <h1>Search!</h1>
        <form> 
            <label>Search: <input  id='lookUp' type="search" name="q" accesskey="s 0"></label>
            <input class='button2' id='search' type="button" value="Go">
            <label>Page:<input  id='pageN' type="search" name="p" accesskey="s 0" value="1"></label>
        </form><br>
        
        
        <table class="searchTable">
            <tr>
                <td >
                    <form action="sendShInfo" method ="post">    
                        <Label>Brand: </label><input class="noManInput" type="text" name="brand" id="output1">
                        <img class="searchImage" id="sImg1" name="image" src="" alt="shoe image1"><br>
                        <Label>Color:</label><input class="noManInput" type="text" id="color1" name="colorS">
                        <Label>Name:</label><input class="noManInput" type="text" id="name1" name="nameS">
                        <Label>SKU:</label><input class="noManInput" type="text" id="sku1" name="sku">
                        <input type="submit" class='button2'value='Rate'>
                    </form>
                </td>
                <td >
                    <Label>Brand: </label><input type="text" name="brand" id="output2">
                    <img class="searchImage" id="sImg2" src="" alt="shoe image2"><br>
                    <Label>Color: </label><input type="text" id="color2" name="color2">
                    <Label>Name: </label><input type="text" id="name2" name="name2">
                    <Label>SKU: </label><div id="sku2">Text</div>
                    <button class='button2'>Rate</button>
                </td>
                <td >
                    <Label>Brand: </label><input type="text" name="brand" id="output3">
                    <img class="searchImage" id="sImg3" src="" alt="shoe image3"><br>
                    <Label>Color: </label><div id="color3">Text</div>
                    <Label>Name: </label><div id="name3">Text</div>
                    <Label>SKU: </label><div id="sku3">Text</div>
                    <button class='button2'>Rate</button>
                </td>
            </tr>
            
        </table>
        
        
    </body>
     <a href="DirectPage?option=Main">Back</a><br>
    <c:import url="/Views/footer.jsp"/>
</html>
