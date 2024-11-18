
<%@page import="RReview.ApiMng"%>
<%@page import="java.util.ArrayList"%>
<%@page import="RReview.Shoe"%>
<%@page import="RReview.ShoeModel"%>
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <link rel="stylesheet" type="text/css" href="Footer.css">
        <script src="scripts/Pager.js"></script>
        
        <title>Search Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <%
            
            String pag1 = request.getParameter("pag");
            if(pag1==null){pag1="1";}
            String lookUpStr1 = request.getParameter("lookUpStr");
            if(lookUpStr1==null){lookUpStr1="";}
        %>    
        <br><br>
        <h1>Search!</h1>
        <form id="searchForm" action="getSearch" method="Post" > 
            <div class="pagination">
            <label>Search: <input  id='lookUpStr' type="search" name="lookUpStr" accesskey="s 0" value="<%=lookUpStr1%>" ></label>
            
                <label>Page:<input class="readonly" id='pageN' type="search" name="pag" accesskey="s 0" readonly="yes" value="<%=pag1%>"></label>
                <button id="PgUp">Page Up</button> 
                &nbsp;
                <button id="PgDwn">Page Down</button>
            </div>
            
            <input class='button2' id='search' type="submit" value="Go">
            <% 
                 
                pag1 = request.getParameter("pag");
                
                ArrayList <Shoe> products= ApiMng.getProductsByPage(pag1,lookUpStr1);
            %>
        </form><br>
          
        <div class="form-container">
        <%
                        for ( Shoe product : products) {
				
			%>    
                        <div  style='height: 350px;'>
                            <div> <%-- class="thumbnail"> --%>
                                    
                                    <form action="sendShInfo2" method ="post">   
                                        <label>Brand: </label>
                                        <input type="text" class="noManInput" name="brand" id="output1" value="<%=product.getBrand()%>"><br>
                                        <img class="searchImage" id="sImg1" name="image" src="<%=product.getImage()%>" alt="shoe image1"><br>
                                        <input type="hidden" class="noManInput" name="image" id="image" value="<%=product.getImage()%>">
                                        <label>Color:</label>
                                        <input type="text" class="noManInput" id="color1" name="colorS" value="<%=product.getsColor()%>">
                                        <label>Name:</label>
                                        <input type="text" class="noManInput" id="name1" name="nameS" value="<%=product.getsTitle()%>">
                                        <label>SKU:</label>
                                        <input type="text" class="noManInput" id="sku1" name="sku" value="<%=product.getSku()%>"><br>
                                    
                                        
                                        <input type="submit" class='button2' avtion='<%=product.getSku()%>' value='Rate'>
                                    </form>
                                    
				</div>
			</div>

			<%
			}
			%>

        </div>
            
            
            
        
        
            
            
          
            
        
        
    </body>
     <a href="DirectPage?option=Main">Back</a><br>
    <c:import url="/Views/footer.jsp"/>
</html>
