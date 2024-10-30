
package RReview;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Profile extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            if (!Login.ensureUserIsLoggedIn(request)) {
                request.setAttribute("message", "You must login");
                response.sendRedirect("Login");
            return;
        }
        
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        User user = UserModel.getUser(username);
        
        request.setAttribute("filename", user.getFilename());
        String url = "/Views/profile.jsp";
        getServletContext().getRequestDispatcher(url).forward(request, response);

        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
