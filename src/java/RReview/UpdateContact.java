
package RReview;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "UpdateContact", urlPatterns = {"/UpdateContact"})
public class UpdateContact extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String contactName = request.getParameter("contactName");
        String contactEmail= request.getParameter("contactEmail");
        String contactMessage= request.getParameter("contactMessage");
        
        
        try {
            if (!Login.ensureUserIsLoggedIn(request)) {
                request.setAttribute("message", "You must login");
                response.sendRedirect("Login");
            return;
            }
            HttpSession session = request.getSession();
            String username = (String)session.getAttribute("username");
            User cuser= UserModel2.getUser(username);
            int user_id=cuser.getId();
            Contact contact = new Contact(user_id,contactName,contactEmail,contactMessage);
            ContactModel.addContact(contact);
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/main.jsp");
            RequetsDispatcherObj.forward(request, response);
        }catch(Exception ex) {
            System.out.println(ex);
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
