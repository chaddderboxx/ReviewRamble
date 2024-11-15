/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package RReview;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "Review", urlPatterns = {"/Review"})
public class Review {
    
    private String sku;
    private String brand;
    private String sColor;
    private String title;
    private String image;
    private Timestamp timestamp;
    private double myRating;
    private String myComment;
    private double sRating;

    public Review(String sku, String brand, String sColor,String title,String image,Timestamp timestamp,  double myRating,String myComment, double sRating) {
        
        this.sku=sku;
        this.brand = brand;
        this.sColor = sColor;
        this.title = title;
        this.image=image;
        this.timestamp = timestamp;
        this.myRating=myRating;
        this.myComment = myComment;
        this.sRating = sRating;
    }
        
    
  
    public String getSku() {
        return sku;
    }
    public String getBrand() {
        return brand;
    }
    public String getsColor() {
        return sColor;
    }
    public String getsTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    
    }
    public double getmyRating() {
        return myRating;
    }
    public String getmyComment() {
        return myComment;
    }
    public double geSrating() {
        return sRating;
    }    
}