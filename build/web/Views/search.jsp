<%-- 
    Document   : search
    Created on : Oct 31, 2024, 9:17:06 PM
    Author     : pedro
--%>

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
    </body>
    <a href="DirectPage?option=Main">Back</a><br>
    <c:import url="/Views/footer.jsp"/>
</html>
