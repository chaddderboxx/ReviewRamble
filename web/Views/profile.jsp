<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <link rel="stylesheet" type="text/css" href="Footer.css">
        <link rel="stylesheet" type="text/css" href="header.css">
        <title>Profile</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        
        <div class="profile-container">
            <div class="leftS">
                <img src="images/GroupIcon.jpg" class="logo" alt="RambleLogo"/>
            </div>
            <div class="righS">
                
                <h2>Welcome ${username}!</h2><br>

                <c:if test="${(filename != null)}">
                    <img class="profileImg" src="GetImage?username=${username}" alt="UserImg" />
                </c:if>
                <h3>Upload a profile picture!</h3>
                <form action="Upload" method="post" enctype="multipart/form-data">
                    <div id="data">
                        <input type="file" accept="image/*" name="file">
                    </div>
                    <div id="buttons">
                        
                        <input type="submit" value="Upload"><br>
                    </div>
                </form>
                <br>
                <a href="DirectPage?option=Main">Home</a><br>
            </div>
        </div>
        

    </body>
    <c:import url="/Views/footer.jsp"/>
</html>