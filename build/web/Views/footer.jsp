<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%
GregorianCalendar currentDate= new GregorianCalendar();
int currentYear = currentDate.get(Calendar.YEAR);
%>

    
<footer>
     
    <p>
        <br> 
        <br>
        &copy;<%= currentYear %>
    <%= "RRambleInc" %>
    </p>
</footer>
</body>
</html>
