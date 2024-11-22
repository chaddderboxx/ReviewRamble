package RReview;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONPointer ;



@WebServlet("/apiRequest")

public class ApiMng extends HttpServlet {

 
    
    public static ArrayList<Shoe> getProductsByPage(String page,String lookUpStr) {
        
        ArrayList<Shoe> products = new ArrayList<>();
        
        
        String apiUrl = "https://api.sneakersapi.dev/search?page="+page+"&query="+lookUpStr;
        
        try{
            
            
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();
          
        
        if (status == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                connection.disconnect(); // Process the API response 
                JSONObject jsonObject1 = new JSONObject(content.toString());
                JSONArray results1= (JSONArray) jsonObject1.get("hits");
                
                for (int j=0;j<20;j++){
                   String categ =(String) results1.getJSONObject(j).get("category");
                   if(categ.equals("Apparel & Accessories > Shoes")){ 
                        String sBrand= (String) results1.getJSONObject(j).get("brand");
                        String sColor= (String) results1.getJSONObject(j).get("color");
                        String sTitle= (String) results1.getJSONObject(j).get("title");
                        String sku = (String) results1.getJSONObject(j).get("sku");
                        String sImage = (String) results1.getJSONObject(j).get("image");
                        Shoe shoe = new Shoe(sku, sBrand ,sColor,sTitle,sImage);
                        products.add(shoe);
                   }
                }
                
               
            } else { 
                //response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Failed to fetch data from API");
            }
        
        
        
            }catch (Exception ex) {
                System.out.println(ex);
            }//end try

            return products;
    }//end public static
 }
