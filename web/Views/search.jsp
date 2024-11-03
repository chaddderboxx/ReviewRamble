<%-- 
    Document   : search
    Created on : Oct 31, 2024, 9:17:06 PM
    Author     : pedro
--%>
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search!</h1>
        <form> 
            <label>Search: <input  type="search" name="q" accesskey="s 0"></label>
            <input id='search' type="submit">
        
        </form>
            <div class="serch-content"> 
                <c:forEach var="shoe" items="${shoes}">
                <div class="read-post-container">
                    
                    <div class="post-input-container">
                        <div class="timage">
                           
                         
                          
                        <img src="GetImageSh?id=${shoe.id}" width="280" height="300"   />
                        </div>
                        <textarea rows="3" readonly="yes">
                          ${shoe.brand}
                        </textarea> 
                        <div class="add-post-links">
                            
                            
                            <a href="Rating?ratingid=${shoe.id}"><img src="images/Like.gif">Rating</a>
                            ${shoe.rating}
                            &nbsp;
                            &nbsp;
                            <%--
                            <a href=""><img src="images/FollowStar.gif">Follow</a>
                            --%>
                            
                        </div>    
                    </div>
                </div>
                </c:forEach>   
            </div>
        
        
        
        
    </body>
    <a href="DirectPage?option=Main">Back</a><br>
    <c:import url="/Views/footer.jsp"/>
</html>
