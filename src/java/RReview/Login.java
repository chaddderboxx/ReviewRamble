
package RReview;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static RReview.Ramble.getSHA;
import static RReview.Ramble.toHexString;


public class Login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String action = request.getParameter("action"); 
            if (action==null){
                String url = "/index.html";
                    getServletContext().getRequestDispatcher(url).forward(request,response);
            }else if (action.equalsIgnoreCase("autent")){
                    String username= request.getParameter("username");
                    String pass= request.getParameter("password");
                    try{
                        
                        String hashedPass = toHexString(getSHA(pass));
                        
                        User user = UserModel.getUser(username);
                        String hashedStoredPass = user.getPassword();
                        if (hashedPass.equals(hashedStoredPass) ){
                            //start session
                            HttpSession session = request.getSession();
                            
                            session.setAttribute("username",username);
                            User user1= UserModel.getUser(username);
                            // Password matches go to main
                            /*
                            ArrayList<TweetExtra> tweets = TweetModel.getTweetsNusers2(user1.getId());
                            request.setAttribute("tweets",tweets);
                            ArrayList<User> users = UserModel.getUsers();
                            request.setAttribute("users",users);
                            request.setAttribute("user",user);
                            
                            ArrayList<Integer> followed= FollowModel.getFollowed(user.getId());
                            ArrayList<Integer> allusers= FollowModel.allUsersId();
                            ArrayList<FollowedUser> fusers =FollowModel.getFollowedUser(followed, allusers, users);
                            ArrayList<NotFollowedUser> nfusers =FollowModel.getNotFollowedUser(followed, allusers, users);
                            request.setAttribute("fusers",fusers);
                            request.setAttribute("nfusers",nfusers);
                            */
                            String url = "/Views/main.jsp";
                            getServletContext().getRequestDispatcher(url).forward(request,response); 
                        }else{
                            String message="Wrong username or password";
                            request.setAttribute("message", message);
                            String url = "/Views/autent.jsp";
                            getServletContext().getRequestDispatcher(url).forward(request,response);
                        }
                        
                        
                    }catch(Exception ex){
                            exceptionPage(ex, request, response);
                    }
                    
                } else if(action.equalsIgnoreCase("createUser")){
                    String pass1= request.getParameter("password1");
                    String pass2= request.getParameter("password2");
                    String username= request.getParameter("username");
                    
                        if (pass1.equalsIgnoreCase(pass2)){

                            try{
                               String hashedPassword = toHexString(getSHA(pass1));    
                               User user = new User(0,username,hashedPassword);
                               UserModel.addUser(user);
                               response.sendRedirect("index.html");
                            }catch(Exception ex){
                                exceptionPage(ex, request, response);
                            }
                        } else {
                        String url = "/Views/addUser.jsp";
                        notSamePassword(url,request, response);
                        }
                    
                }
       
    }
    private void exceptionPage(Exception ex, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String error = ex.toString();
        request.setAttribute("error", error);
        String url = "/Views/error.jsp";
        getServletContext().getRequestDispatcher(url).forward(request,response);
    }
    private void notSamePassword(String url, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String message="Passwords need to be the same";
        request.setAttribute("message", message);
        //String url = "/Views/updateUser.jsp";
        getServletContext().getRequestDispatcher(url).forward(request,response);
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
    public static boolean ensureUserIsLoggedIn(HttpServletRequest request){ // Http+ServletRequest)(){
        HttpSession session = request.getSession();
        String sessionUserName = (String)session.getAttribute("username"); 
        return sessionUserName !=  null;     
        }
}
