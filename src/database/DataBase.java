package database;
import java.sql.*;
/**
 *
 * @author vavilovaiana
 */
public class DataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{ 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/contact", "vavilovaiana", "i1404Vav");
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM FRIENDS");
        
        while (rs.next()) {
        String s = rs.getString("Name");
        float n = rs.getFloat("DateCreated");
        System.out.println(s + "Surname" + n);
    }
        }catch(SQLException e){
            System.err.println(e);
        }                 
     
      }

}

    

