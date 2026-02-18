import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
public class issue {
    public void addissue(){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the book_id:");
            int bid=sc.nextInt();
            System.out.println("Enter the Student_id:");
            int sid=sc.nextInt();
        try{
            Connection con=DBconnection.getConnection();
         
          
            String sql="select quantity from book where book_id=?";
               PreparedStatement ps=con.prepareStatement(sql);
               ps.setInt(1,bid);
               ResultSet rs=ps.executeQuery();
               if(rs.next() && rs.getInt("quantity")>0){
                String insert="insert into issue(book_id,student_id,issue_date) values (?,?,CURDATE())";
                PreparedStatement ins=con.prepareStatement(insert);
                ins.setInt(1,bid);
                ins.setInt(2,sid);
                ins.executeUpdate();
                
                String upda="update book set quantity=quantity-1 where book_id=?";
                PreparedStatement upd=con.prepareStatement(upda);
                upd.setInt(1,bid);
                upd.executeUpdate();
                 
                System.out.println("Book Issued Successfully.");

               }
               else{
                System.out.println("Books are not Available in library.");
               }
         
        }catch(Exception e){
            
            e.printStackTrace();
        }

    }
    
}
