package RReview;

import java.awt.image.BufferedImage;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;

public class ShoeModel {

    public static ArrayList<Shoe> getShoe() {
        ArrayList<Shoe> shoes = new ArrayList<>();
        try {
            Connection connection = DatabaseConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("select * from shoe order by rating desc");
            while (results.next()) {
                int id = results.getInt("id");
                String sku = results.getString("sku");
                String brand = results.getString("brand");
                String sColor = results.getString("sColor");
                String title = results.getString("title");
                String image = results.getString("image");
                Timestamp timestamp = results.getTimestamp("timestamp");
                String filename = results.getString("filename");
                double rating = results.getDouble("rating");

                Shoe shoe = new Shoe(id,sku, brand, sColor, title, image, timestamp, filename, rating);
                shoes.add(shoe);
            }
            results.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return shoes;
    }

    public static void addShoe(Shoe shoe) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String preparedSQL ="INSERT INTO shoe(sku,brand,sColor, title, filename)"
                    +" VALUES(?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(preparedSQL, Statement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1,shoe.getSku()) ;
                preparedStatement.setString(2,shoe.getBrand()) ;
                preparedStatement.setString(3,shoe.getsColor()) ;
                preparedStatement.setString(4,shoe.getsTitle()) ;
                //preparedStatement.setBlob(4, inputStream);
                preparedStatement.setString(5, shoe.getImage());
                

            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static int  getShoeIdBySku(String skuToSearch) {
        
        int shoeId=0;
        try {
            Connection connection = DatabaseConnection.getConnection();
            
            String query ="select * from shoe where sku=?";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, skuToSearch);
            
            ResultSet results = statement.executeQuery();
            
            while ( results.next() ){
                 
                 shoeId= results.getInt("id");
                 
            }//end while
            
            results.close();
            statement.close();
            connection.close();
            
            
            
        } catch (Exception ex) {
            System.out.println(ex);
        }//end try
        
        return shoeId;
    }//end method
    public static QRResult getRatSumAndQtyById(int idToSearch) {
        double sQty=0;
        double ratSum=0;
        
        try {
            Connection connection = DatabaseConnection.getConnection();
            String query ="SELECT  count(*) AS quantity, SUM(post.my_rating) AS suma FROM post WHERE shoe_id=?";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idToSearch);
            
            ResultSet results = statement.executeQuery();
            
            while ( results.next() ){
                sQty=results.getInt("quantity");
                ratSum = results.getDouble("suma"); 
            }//end while
            
            results.close();
            statement.close();
            
            
            
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }//end try
        QRResult result = new QRResult(ratSum,sQty);
        return result;
    }//end method
    
    public static void updateRanking(Shoe shoe, double rank) {
        try { 
            Connection connection = DatabaseConnection.getConnection(); 
            String query = "UPDATE shoe SET rating = ? WHERE sku = ?"; 
            PreparedStatement statement = connection.prepareStatement(query); 
            statement.setDouble(1, rank); 
            statement.setString(2, shoe.getSku()); 
            statement.executeUpdate(); 
            statement.close(); 
            connection.close(); 
    } catch (Exception ex) { 
        System.out.println(ex); 
        } 
    }//end try
        
        
    
    
    
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
}//end model
