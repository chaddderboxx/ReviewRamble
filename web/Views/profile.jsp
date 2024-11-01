<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <title>Profile</title>
    </head>
    <body>
        <h2>Welcome ${username}!</h2><br>
        
        <c:if test="${(filename != null)}">
            <img src="GetImage?username=${username}" width="240" height="300"/>
        </c:if>
        <h3>upload a profile picture!</h3>
        <form action="Upload" method="post" enctype="multipart/form-data">
            <div id="data">
                <input type="file" accept="image/*" name="file">
            </div>
            <div id="buttons">
                <label>&nbsp;</label>
                <input type="submit" value="Upload"><br>
            </div>
        </form>
        <a href="DirectPage?option=Main">Back</a><br>
    </body>
</html>