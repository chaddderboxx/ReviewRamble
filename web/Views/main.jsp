<%-- 
    Document   : main
    Created on : Nov 10, 2024, 10:37:46 PM
    Author     : chad
--%>
<%@page import="RReview.User"%>
<%@page import="RReview.Shoe"%>
<%@page import="RReview.UserModel"%>
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Review Ramble</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="mainpage.css">
    <link rel="stylesheet" type="text/css" href="Footer.css">
</head>
<body>
    <div class="page-container">
        <!-- Left Link List with Logo -->
        <div class="left-links">
            <div class="logo-container">
                <img src="images/GroupIcon.jpg" class="logo" alt="Ramble Logo">
            </div>
            <h2>Navigation</h2>
            <a href="DirectPage?option=Main" class="home-link">
                <img src="images/Home.png" alt="Home Icon" class="home-icon"> Home
            </a>
            <a href="DirectPage?option=About" class="about-link"> 
                <img src="images/about.gif" alt="About Icon" class="about-icon"> About
            </a>
            <a href="MyReviews" class="post-gallery-link">
                <img src="images/PostGalleryIcon.png" alt="Post Gallery Icon" class="postgallery-icon"> My Posts Gallery
            </a>
            <a href="Search" class="search-link">
                <img src="images/SearchIcon.png" alt="Search Icon" class="search-icon"> Search and Post
            </a>
            <a href="TheReviews" class="post-link">
                <img src="images/PostIcon.png" alt="Post Icon" class="post-icon"> The Reviews
            </a>
            <a href="Profile" class="contact-link">
                <img src="images/AboutIcon.png" alt="Contact Icon" class="contact-icon"> Profile
            </a>
            <a href="DirectPage?option=Contact" class="contact-link">
                <img src="images/ContactIcon.png" alt="Contact Icon" class="contact-icon"> Contact
            </a>
            <a href="SignOut" class="signout-link">
                <img src="images/SignOutIcon.png" alt="Sign Out Icon" class="signout-icon"> Sign Out
            </a>
        </div>

        <!-- Right Column with Three Vertical Blocks -->
        <div class="right-column">
            <!-- First Block: Shoes Market -->
            <div class="content-block">
                <h3>Shoes Market</h3>
                <img src="images/MordorIntelligence.png" alt="Shoes Market" class="content-image">
                <a href="https://www.mordorintelligence.com/industry-reports/footwear-market" class="read-more">Read More</a>
            </div>

            <!-- Second Block: Major Players -->
            <div class="content-block">
                <h3>Major Players</h3>
                <img src="images/MajorPlayers.png" alt="Major Players" class="content-image">
                <ul class="brand-list">
                    <li><a href="https://www.adidas.com" target="_blank">Adidas</a></li>
                    <li><a href="https://www.nike.com" target="_blank">Nike</a></li>
                    <li><a href="https://www.puma.com" target="_blank">Puma</a></li>
                    <li><a href="https://www.sketchers.com" target="_blank">Sketchers</a></li>
                    <li><a href="https://www.kering.com" target="_blank">Kering</a></li>
                </ul>
                <a href="#" class="read-more">Read More</a>
            </div>

            <!-- Third Block: Online Stores -->
            <div class="content-block">
                <h3>Online Stores</h3>
                <div class="store-columns">
                    <ul class="store-list">
                        <li><a href="https://www.zappos.com" target="_blank">Zappos</a></li>
                        <li><a href="https://www.shopbob.com" target="_blank">Shopbop</a></li>
                        <li><a href="https://www.nordstrom.com" target="_blank">Nordstrom</a></li>
                        <li><a href="https://www.dsw.com" target="_blank">DSW</a></li>
                        <li><a href="https://www.footlocker.com" target="_blank">Footlocker</a></li>
                    </ul>
                    <ul class="store-list">
                        <li><a href="https://www.amazon.com" target="_blank">Amazon</a></li>
                        <li><a href="https://www.asos.com" target="_blank">Asos</a></li>
                        <li><a href="https://www.roadrunnersports.com" target="_blank">Road Runner Sports</a></li>
                        <li><a href="https://www.stockx.com" target="_blank">StockX</a></li>
                    </ul>
                </div>
                <a href="#" class="read-more">Read More</a>
            </div>
        </div>
    </div>
      
</body>
  <!-- Footer Section -->
   <c:import url="/Views/footer.jsp"/>  
</html>
