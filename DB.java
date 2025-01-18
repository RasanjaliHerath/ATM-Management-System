
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
   
    public static Connection c;
    
    static{
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3307/emcl_atm";
            String un ="root";
            String pw ="Lily@152";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/emcl_atm?useSSL=false",un, pw);
        
        } catch(Exception e){
            
        
            e.printStackTrace();
          }
    
    }
    
    public static void iud (String query) throws Exception{
    
        Statement   s = c.createStatement();
        s.executeUpdate(query);
    }
    
    public static ResultSet search (String query) throws Exception{
    
        Statement   s = c.createStatement();
        ResultSet  rs =s.executeQuery(query);
        return rs;
    }

   
    
    
}

