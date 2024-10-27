<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%
GregorianCalendar currentDate= new GregorianCalendar();
int currentYear = currentDate.get(Calendar.YEAR);
%>

    
<footer>
     
    <p>
         <nav> 
            <a href="index.html">Back</a>
        </nav>  
        <br>
        
        &copy;<%= currentYear %>
    <%= "Bad Twitter Clone" %>
    </p>
</footer>
</body>
</html>
