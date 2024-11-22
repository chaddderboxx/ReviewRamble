
package RReview;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class sendShInfo extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        response.setContentType("text/html;charset=UTF-8");
        String sku= request.getParameter("action");
        System.out.println("Parameter: " + sku);
        response.getWriter().println("Check the console for log messages.");
        String brand= request.getParameter("brand");
        String sColor= request.getParameter("colorS");
        String nameS = request.getParameter("nameS");
        //String sku = request.getParameter("sku");
        
            
        request.setAttribute("brand",brand);
        request.setAttribute("colorS",sColor);
        request.setAttribute("nameS",nameS);
        request.setAttribute("sku",sku);
         
    } 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        
            String url = "/Views/addShoe.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
            
    }
    
    
    
    
    

    
    

   

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
private void exceptionPage(Exception ex, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String error = ex.toString();
        request.setAttribute("error", error);
        String url = "/Views/error.jsp";
        getServletContext().getRequestDispatcher(url).forward(request,response);
    }
}

