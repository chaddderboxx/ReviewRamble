package RReview;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContactModel {

    public static void addContact(Contact contact){
       try{
           Connection connection = DatabaseConnection.getConnection();
           
           String query="insert into contact (user_id, contact_name, contact_email, contact_message)"
                +" values(?,?,?,?)";
           PreparedStatement statement= connection.prepareStatement(query);
           
           statement.setInt(1,contact.getUserId());
           statement.setString(2,contact.getContactName());
           statement.setString(3,contact.getContactEmail());
           statement.setString(4,contact.getContactMessage());
           
           statement.execute();
           
           statement.close();
           connection.close();
       } catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}
