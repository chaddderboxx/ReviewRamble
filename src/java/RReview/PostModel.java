/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package RReview;

import java.awt.image.BufferedImage;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;

public class PostModel {
    
    public static ArrayList<Post> getPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        try{
            Connection connection = DatabaseConnection.getConnection();
            Statement statement= connection.createStatement();
            ResultSet results=statement.executeQuery("select * from post");
            while(results.next()){
                int userId=results.getInt("user_id");
                int shoeId=results.getInt("shoe_id");
                double pRating=results.getDouble("rating");
                String  pComment = results.getString("comment");
                Timestamp timestamp = results.getTimestamp("timestamp");
                
                
                Post post = new Post(userId,shoeId,pRating,pComment,timestamp);
                posts.add(post);
            }
            results.close();
            statement.close();
            connection.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return posts;
    }
    
    public static ArrayList<Review> getReviewByUserId(int userId){
        ArrayList<Review> reviews = new ArrayList<>();
        try{
            Connection connection = DatabaseConnection.getConnection();
            
             String query = "select * from post inner join shoe on post.shoe_id = shoe.id   where user_id=?";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, userId);
            
            ResultSet results = statement.executeQuery();
            
            
            while(results.next()){
                String sku =results.getString("sku");
                String brand =results.getString("brand");
                String sColor =results.getString("sColor");
                String sName=results.getString("title");
                String sImage=results.getString("filename");
                Timestamp timeSt = results.getTimestamp("timestamp");
                
                double myRating=results.getDouble("my_rating");
                String  myComment = results.getString("comment");
                double sRating= results.getInt("rating");
                
                
                
                Review review = new Review(sku,brand,sColor,sName,sImage,timeSt, myRating, myComment, sRating);
                reviews.add(review);
            }
            results.close();
            statement.close();
            connection.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return reviews;
    }
    
    public static ArrayList<Review> getReviewByShoeId(int shoeId){
        ArrayList<Review> reviews = new ArrayList<>();
        try{
            Connection connection = DatabaseConnection.getConnection();
            
             String query = "select * from post inner join shoe on post.shoe_id = shoe.id   where shoe_id=?";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, shoeId);
            
            ResultSet results = statement.executeQuery();
            
            
            while(results.next()){
                String sku =results.getString("sku");
                String brand =results.getString("brand");
                String sColor =results.getString("sColor");
                String sName=results.getString("title");
                String sImage=results.getString("filename");
                Timestamp timeSt = results.getTimestamp("timestamp");
                
                double myRating=results.getDouble("my_rating");
                String  myComment = results.getString("comment");
                double sRating= results.getInt("rating");
                
                
                
                Review review = new Review(sku,brand,sColor,sName,sImage,timeSt, myRating, myComment, sRating);
                reviews.add(review);
            }
            results.close();
            statement.close();
            connection.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return reviews;
    }        
    public static ArrayList<Review> getAllReviews(){
        ArrayList<Review> reviews = new ArrayList<>();
        try{
            Connection connection = DatabaseConnection.getConnection();
            
             String query = "select * from post inner join shoe on post.shoe_id = shoe.id order by rating" ;
            
            PreparedStatement statement = connection.prepareStatement(query);
            
            
            ResultSet results = statement.executeQuery();
            
            
            while(results.next()){
                String sku =results.getString("sku");
                String brand =results.getString("brand");
                String sColor =results.getString("sColor");
                String sName=results.getString("title");
                String sImage=results.getString("filename");
                Timestamp timeSt = results.getTimestamp("timestamp");
                
                double myRating=results.getDouble("my_rating");
                String  myComment = results.getString("comment");
                double sRating= results.getInt("rating");
                
                
                
                Review review = new Review(sku,brand,sColor,sName,sImage,timeSt, myRating, myComment, sRating);
                reviews.add(review);
            }
            results.close();
            statement.close();
            connection.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return reviews;
    }
    
    
    
    
    
       public static void addPost(Post post) { 
           Connection connection = null; 
           PreparedStatement statement = null; 
           try { 
               connection = DatabaseConnection.getConnection(); 
           String query = "INSERT INTO post(user_id, shoe_id, my_rating, comment) VALUES(?, ?, ?, ?)"; 
           statement = connection.prepareStatement(query); 
           statement.setInt(1, post.getUserId()); 
           statement.setInt(2, post.getShoeId()); 
           statement.setDouble(3, post.getPRating()); 
           statement.setString(4, post.getPComment()); 
           statement.executeUpdate(); 
           } catch (Exception ex) { 
               System.out.println(ex); 
           } finally { 
               try { 
                   if (statement != null) {
                       statement.close(); 
                   } 
                   if (connection != null) { 
                       connection.close(); 
                   } 
               } catch (Exception e) {
                   System.out.println(e);
               } 
            } 
       }
    /*
    public static ArrayList<TweetExtra> getTweetsNusers(){
        ArrayList<TweetExtra> tweetsE = new ArrayList<>();
        try{
            Connection connection = DatabaseConnection.getConnection();
            Statement statement= connection.createStatement();
            ResultSet results=statement.executeQuery("SELECT tweet.id, tweet.text,"
                    +"tweet.user_id, user.username, tweet.timestamp, tweet.image, tweet.likes"
                    + " FROM tweet INNER JOIN user ON tweet.user_id= user.id ORDER BY timestamp DESC");
            while(results.next()){
                int id=results.getInt("id");
                String text = results.getString("text");
                int user_id=results.getInt("user_id");
                String username2 =results.getString("username");
                Timestamp timestamp = results.getTimestamp("timestamp");
                int likes=results.getInt("likes");
                //Timestamp tweetTimeStamp = new Timestamp(timestamp) {};
                TweetExtra tweet = new TweetExtra(id,text,timestamp,user_id,username2,likes);
                tweetsE.add(tweet);
            }
            results.close();
            statement.close();
            connection.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return tweetsE;
    }
    public static void addLikes(int tweetId, int likesNum){
       try{
           Connection connection = DatabaseConnection.getConnection();
           
           String query="UPDATE tweet SET likes=? WHERE id=?";
                    
           PreparedStatement statement= connection.prepareStatement(query);
           
           statement.setInt(1, likesNum+1);
           statement.setInt(2, tweetId);
           
           
           statement.execute();
           
           statement.close();
           connection.close();
       } catch(Exception ex){
           System.out.println(ex);
       }
    }
    public static int getLikesById(int tweetId){
        int likesNum = 0;
        try{
            
            Connection connection = DatabaseConnection.getConnection();
            
             String query = "SELECT likes FROM tweet "
                    + " WHERE id = ? ";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, tweetId);
            
            ResultSet results = statement.executeQuery();
            
            while ( results.next() ){
                 likesNum = results.getInt("likes");
                
                
            }
            
            results.close();
            statement.close();
            connection.close();

        }
        catch ( Exception ex ){
            System.out.println(ex);
        }
        
        return likesNum;
    }
    public static ArrayList<TweetExtra> getTweetsNusers2(int userId){
        ArrayList<TweetExtra> tweetsE = new ArrayList<>();
        try{
            
            
            Connection connection = DatabaseConnection.getConnection();
            
            String query=("SELECT tweet.id, tweet.text,tweet.user_id,user.username, tweet.timestamp, tweet.image, tweet.likes FROM tweet "
                    
                    + "INNER JOIN user ON tweet.user_id= user.id "
                    + "INNER JOIN (SELECT following.following_user_ID FROM user INNER JOIN following "
                    + "ON user.id=following.followed_by_user_ID "
                    + "WHERE user.id= ? )c "
                    + "ON tweet.user_id = c.following_user_ID ORDER BY tweet.timestamp DESC");
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, userId);
            
            ResultSet results = statement.executeQuery();
            
            
            while(results.next()){
                int id=results.getInt("id");
                String text = results.getString("text");
                int user_id=results.getInt("user_id");
                String username2 =results.getString("username");
                Timestamp timestamp = results.getTimestamp("timestamp");
                int likes=results.getInt("likes");
                //Timestamp tweetTimeStamp = new Timestamp(timestamp) {};
                TweetExtra tweet = new TweetExtra(id,text,timestamp,user_id,username2,likes);
                tweetsE.add(tweet);
            }
            results.close();
            statement.close();
            connection.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return tweetsE;
    }
*/
}
