
package RReview;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;



/**
 * Servlet implementation class AddProductSrv
 */
@WebServlet("/sendShInfo2")
@MultipartConfig(maxFileSize = 16177215)
public class sendShInfo2 extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
               if (!Login.ensureUserIsLoggedIn(request)) {
                request.setAttribute("message", "You must login");
                response.sendRedirect("Login");
                return;
                }         
			

		//String sku= request.getParameter("action");
                String brand= request.getParameter("brand");
                String colorS= request.getParameter("colorS");
                String nameS = request.getParameter("nameS");
                String sku = request.getParameter("sku");
                String image = request.getParameter("image");


                request.setAttribute("brand",brand);
                request.setAttribute("colorS",colorS);
                request.setAttribute("nameS",nameS);
                request.setAttribute("sku",sku);
                request.setAttribute("image",image);

		//status = product.addProduct(prodName, prodType, prodInfo, prodPrice, prodQuantity, prodImage);

		//RequestDispatcher rd = request.getRequestDispatcher("addProduct.jsp?message=" + status);
		//rd.forward(request, response);
                String url = "/Views/addShoe.jsp";
                getServletContext().getRequestDispatcher(url).forward(request, response);    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
