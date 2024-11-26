<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<header> 
    <div class="left">

        <a href="DirectPage?option=Main" ><img  src="images/Home.png" alt="h.img">Home</a>

        <a href= "Profile" > <img src="GetImage?username=${username}" alt="UserImg" class="userImg"  />Profile </a>
    </div>

    <div class="center">
        <h1>Review Ramble</h1>
    </div>

    <div class="right">
        
        
        <img  src="images/off.gif" alt="h.img">
        <a href= "SignOut" > SignOut </a> 
    </div>
</header>   
