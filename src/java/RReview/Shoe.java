
package RReview;

import java.awt.image.BufferedImage;
import java.sql.Timestamp;


public class Shoe {
    private int id;
    private String sku;
    private String brand;
    private String sColor;
    private String title;
    private String image;
    private Timestamp timestamp;
    private String  filename;
    private double rating;

    public Shoe(int id,String sku, String brand, String sColor,String title,String image, Timestamp timestamp, String filename, double rating) {
        this.id = id;
        this.sku=sku;
        this.brand = brand;
        this.sColor = sColor;
        this.title = title;
        this.image=image;
        this.timestamp = timestamp;
        this.filename= filename;
        this.rating=rating;
    }
        
    public Shoe(String sku, String brand, String sColor,String title,String image){
        this.sku=sku;
        this.brand = brand;
        this.sColor = sColor;
        this.title = title;
        this.image=image;   
    
    }
    
    
    
    
    
    
    public int getId() {
        return id;
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
    public String getFilename() {
        return filename;
    }
    public double getRating() {
        return rating;
    }
        
}