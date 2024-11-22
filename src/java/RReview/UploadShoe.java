
package RReview;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
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
        
        String sku = request.getParameter("sku");
        String brand= request.getParameter("brand");
        String colorS= request.getParameter("colorS");
        String nameS = request.getParameter("nameS");
        String filename=request.getParameter("sImg");
        String rating = request.getParameter("rating");
        String comment = request.getParameter("comment");
        
        Shoe theShoe= new Shoe(sku,brand,colorS,nameS,filename);
        
        double ratingD = Double.parseDouble(rating);
        
        try{
            HttpSession session = request.getSession();
            String username = (String)session.getAttribute("username");
            User cuser= UserModel.getUser(username);
            int user_id=cuser.getId();
            int shoeId= ShoeModel.getShoeIdBySku(sku);
            QRResult qrresult = ShoeModel.getRatSumAndQtyById(shoeId);
            
            
                int id=0;
                double NewRank=0;
            if (qrresult.getRatQty()==0){
            
                ShoeModel.addShoe(theShoe);
            };
            NewRank = ((qrresult.getRatingSum()+ratingD)/(qrresult.getRatQty()+1));
            
            id= ShoeModel.getShoeIdBySku(sku);
            
            ShoeModel.updateRanking(theShoe, NewRank);
             Post post=new Post(user_id,id,ratingD,comment);   
             PostModel.addPost(post);
           ///////////////////////////////////////////////////
           
           
            RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Views/main.jsp");
            RequetsDispatcherObj.forward(request, response); 
                
        }catch(Exception ex) {
            System.out.println(ex);
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