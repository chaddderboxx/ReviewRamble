package RReview;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class DatabaseConnection {
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/ramble";
            String username="Rambler";
            String password="test";
            Connection connection = DriverManager.getConnection(
            dbURL,username,password);
            return connection;
    }        
            
}
