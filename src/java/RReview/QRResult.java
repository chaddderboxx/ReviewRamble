/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package RReview;


import javax.servlet.annotation.WebServlet;



@WebServlet(name = "QRResult", urlPatterns = {"/QRResult"})
public class QRResult {
    private double ratingSum;
    private double RatQty;
    
    
    public QRResult(double ratingSum, double RatQty){
        
        this.RatQty= RatQty;
        this.ratingSum= ratingSum;
        
        
        
    }
    public double getRatQty() {
        return RatQty;
    }
    public double getRatingSum() {
        return ratingSum;
    }
    
}