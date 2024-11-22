<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%
GregorianCalendar currentDate= new GregorianCalendar();
int currentYear = currentDate.get(Calendar.YEAR);
%>
<footer class="footer-content">
    <div class="footer-container">
        <div class="footer-column">
            <h3>Content Links</h3>
            <a href="TheReviews">Review Gallery</a>
            <a href="Top3">Top Rated Shoes</a>
            <a href="#">New Arrivals</a>
        </div>
        <div class="footer-column center-column">
            <p>Made with love at OCC</p>
        </div>
        <div class="footer-column">
            <img src="images/OCCOwls.gif" alt="OCC Owls" class="owl-image">
        </div>
    </div>
    
    <p>
        <br> 
        <br>
        &copy;<%= currentYear %>
    <%= "RRambleInc" %>
    </p>
</footer>

