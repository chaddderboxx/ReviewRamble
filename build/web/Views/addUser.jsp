<%-- 
    Document   : addUser
    Created on : Oct 27, 2024, 12:13:02 AM
    Author     : pedro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <title>Add User page</title>
    </head>


    <body>
        <div>
            <header>
                <h1 class="TopTitle">Review Ramble</h1>
            </header>
        </div>
        <container> 
            <leftS>
                <img src="images/GroupIcon.jpg" class="logo" alt="RambleLogo"/>
            </leftS>
            <righS>
                <h1> New User </h1><br><br>
                <form action="Login" method ="post">
                    <label >Username &emsp;&emsp;&emsp;</label>
                    <input type="text" name="username" required><br>
                    <br>
                    <label >Password &emsp;&emsp;&emsp;&nbsp;</label>
                    <input type="password" name="password1" required><br>
                    <br>
                    <label >Repeat Password</label>
                    <input type="password" name="password2" required><br>
                    <br>
                    <input type="hidden" name="action" value="createUser" />
                    <input type="submit" class="button1" value="New User" class="margin_left">

                </form>
                <br>
                <h6><c:out value= "${message}" /></h6>
                <br> 
                <a href="index.html">Back</a>
            </righS>
        </container>
        <c:import url="/Views/footer.jsp"/>
    </body>
</html>

