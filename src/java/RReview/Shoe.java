
package RReview;

import java.awt.image.BufferedImage;
import java.sql.Timestamp;


public class Shoe {
    private int id;
    private String brand;
    private String sColor;
    private String type;
    private String image;
    private Timestamp timestamp;
    private String  filename;
    private double rating;

    public Shoe(int id, String brand, String sColor,String type,String image, Timestamp timestamp, String filename, double rating) {
        this.id = id;
        this.brand = brand;
        this.sColor = sColor;
        this.type = type;
        this.image=image;
        this.timestamp = timestamp;
        this.filename= filename;
        this.rating=rating;
    }
        

    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public String getsColor() {
        return sColor;
    }
    public String getsType() {
        return type;
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