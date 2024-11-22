
package RReview;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class getSearch extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
            String pag = request.getParameter("pag");
            String lookUpStr = request.getParameter("lookUpStr"); 
            response.getWriter().println("GET request handled"); 
            request.setAttribute("pag", pag);
            request.setAttribute("lookUpStr", lookUpStr);
            String url = "/Views/search3.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
    } 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
            String url = "/Views/search3.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
    }
    
    
    
   
            
            
        
    
 private void exceptionPage(Exception ex, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String error = ex.toString();
        request.setAttribute("error", error);
        String url = "/Views/error.jsp";
        getServletContext().getRequestDispatcher(url).forward(request,response);
    }
}
   

    

  


