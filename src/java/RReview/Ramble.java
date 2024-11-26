/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package RReview;


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Ramble extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String action = request.getParameter("action");
                
                
                if (!Login.ensureUserIsLoggedIn(request)){
                    request.setAttribute("message","You must login");
                    response.sendRedirect("/Views/autent");
                    return;
                    
                }
               

                ArrayList<User> users = UserModel2.getUsers();
                if (action==null){
                    
                    request.setAttribute("users",users);
                    String url = "/users.jsp";
                    getServletContext().getRequestDispatcher(url).forward(request,response);
                    
                
                    
                }else if(action.equalsIgnoreCase("listUsers")){
                    
                    request.setAttribute("users",users);
                    String url = "/users.jsp";
                    getServletContext().getRequestDispatcher(url).forward(request,response);
                }else if(action.equalsIgnoreCase("updateUser")){
                    int id = Integer.parseInt(request.getParameter("id"));
                    String pass1= request.getParameter("password1");
                    String pass2= request.getParameter("password2");
                    String username= request.getParameter("username");
                    if (pass1.equalsIgnoreCase(pass2)){
                                               
                        try{
                           String hashedPassword = toHexString(getSHA(pass1));    
                           User user = new User(id,username,hashedPassword);
                           UserModel2.updateUser(user);
                           response.sendRedirect("Twitter");
                        }catch(Exception ex){
                            exceptionPage(ex, request, response);
                        }
                    } else {
                        String url = "/Views/updateUser.jsp";
                        notSamePassword(url,request, response);
                    }
                }else if(action.equalsIgnoreCase("deleteUser")){
                    int id = Integer.parseInt(request.getParameter("id"));
                    try{
                        User user = new User(id,"","");
                           UserModel2.deleteUser(user);
                           response.sendRedirect("Twitter");
                        
                    }catch(Exception ex){
                            exceptionPage(ex, request, response);
                    }
                    
                }
                    
                
        
        
    }
    private void notSamePassword(String url, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String message="Passwords need to be the same";
        request.setAttribute("message", message);
        //String url = "/Views/updateUser.jsp";
        getServletContext().getRequestDispatcher(url).forward(request,response);
    }
    

    private void exceptionPage(Exception ex, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String error = ex.toString();
        request.setAttribute("error", error);
        String url = "/Views/error.jsp";
        getServletContext().getRequestDispatcher(url).forward(request,response);
    }
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return md.digest(input.getBytes(StandardCharsets.UTF_8));
        }  
    public static String toHexString(byte[] hash){
            BigInteger number = new BigInteger(1,hash);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length()<32){
                hexString.insert(0, '0');
            }
            return hexString.toString();
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
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
