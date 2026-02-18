import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class DBconnection{
    static String url="jdbc:mysql://localhost:3306/library_management_system";
    static String user="root";
    static String password="Deepak@123";
   
    public static Connection getConnection(){
        Connection con=null;
        try{
            con=DriverManager.getConnection(url,user,password);
            System.out.println("Database Connected Sucessfully.");
        }catch(Exception e){
            System.out.println("Connection Faild!");
            e.printStackTrace();
        }
        return con;
    } 


}
