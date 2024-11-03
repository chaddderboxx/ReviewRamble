
package RReview;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize=1000000)

public class UploadShoe extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        

        
        InputStream inputStream = null; // input stream of the upload file
        String fileName = "";
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("file");
        if (filePart != null) {
            fileName = extractFileName(filePart);
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        String brand= request.getParameter("brand");
        String sColor= request.getParameter("sColor");
        String type = request.getParameter("type");
        
        
        try{
            HttpSession session = request.getSession();
            String username = (String)session.getAttribute("username");
                        
            Connection connection = DatabaseConnection.getConnection();
            
            String preparedSQL ="INSERT INTO shoe(brand,sColor, type, image, filename)"
                    +" VALUES(?,?,?,?,?)";
           PreparedStatement preparedStatement = connection.prepareStatement(preparedSQL);
           
           preparedStatement.setString(1,brand) ;
           preparedStatement.setString(2,sColor) ;
           preparedStatement.setString(3,type) ;
           preparedStatement.setBlob(4, inputStream);
           preparedStatement.setString(5, fileName);
            
            
            preparedStatement.executeUpdate();

            preparedStatement.close();
            
            connection.close();
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/main.jsp");
            RequetsDispatcherObj.forward(request, response); 
                
        }catch (SQLException ex) {
            request.setAttribute("error", ex.toString());
            String url = "/Views/error.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
        } catch (ClassNotFoundException ex) {
            request.setAttribute("error", ex.toString());
            String url = "/Views/error.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
        
        }
        
    }
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
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