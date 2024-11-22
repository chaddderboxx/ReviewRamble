
package RReview;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DirectPage extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String option = request.getParameter("option");
        if(option.equalsIgnoreCase("About")){
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/about.jsp");
            RequetsDispatcherObj.forward(request, response);
        }
        
         if(option.equalsIgnoreCase("Search")){
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/search2.jsp");
            RequetsDispatcherObj.forward(request, response);
        }
         if(option.equalsIgnoreCase("AddShoe")){
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/addShoe.jsp");
            RequetsDispatcherObj.forward(request, response);
        }
        if(option.equalsIgnoreCase("Contact")){
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/contact.jsp");
            RequetsDispatcherObj.forward(request, response);
        }
        if(option.equalsIgnoreCase("Profile")){
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("Profile");
            RequetsDispatcherObj.forward(request, response);
        }
        if(option.equalsIgnoreCase("Main")){
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/main.jsp");
            RequetsDispatcherObj.forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
