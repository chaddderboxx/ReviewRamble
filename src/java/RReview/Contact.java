
package RReview;

import java.io.Serializable;

public class Contact implements Serializable {
   private int id;
   private int userId;
   private String contactName;
   private String contactEmail;
   private String contactMessage;
   
   
    
        
    public Contact(int id, int userId, String contactName, String contactEmail, String contactMessage) {
        this.id = id;
        this.userId = userId;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactMessage = contactMessage;
    }
    public Contact(int userId, String contactName, String contactEmail, String contactMessage) {
        this.userId = userId;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactMessage = contactMessage;
    }
    
    public int getId() {
        return id;
    }
    public int getUserId() {
        return userId;
    }
    public String getContactName() {
        return contactName;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public String getContactMessage() {
        return contactMessage;
    }
   
}
