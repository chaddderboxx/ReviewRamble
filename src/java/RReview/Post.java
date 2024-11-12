
package RReview;

import java.sql.Timestamp;


public class Post {
    private int userId;
    private int shoeId;
    private double pRating;
    private String pComment;
    private Timestamp timestamp;
    

    public Post(int userId,int shoeId,double pRating, String pComment,Timestamp timestamp) {
        this.userId = userId;
        this.shoeId=shoeId;
        this.pRating = pRating;
        this.pComment = pComment;
        this.timestamp = timestamp;
        
    }
        
    public Post(int userId,int shoeId,double pRating, String pComment){
        this.userId = userId;
        this.shoeId=shoeId;
        this.pRating = pRating;
        this.pComment = pComment;
    
    }
    
    
    
    public int getUserId() {
        return userId;
    }
    public int getShoeId() {
        return shoeId;
    }
    public double getPRating() {
        return pRating;
    }
    public String getPComment() {
        return pComment;
    }
    
    public Timestamp getTimestamp() {
        return timestamp;
    }
    
        
}