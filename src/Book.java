import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Book{
    
    public void addbook(){
        Scanner sc=new Scanner(System.in);
        String sql="insert into book(book_id,book_name,author,quantity) values (?,?,?,?)";
        try{
        Connection con=DBconnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        System.out.println("Enter how many book do you want to insert:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the Book id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Book Name:");
            String name=sc.nextLine();
            System.out.println("Enter the Book author name:");
            String author=sc.nextLine();
            System.out.println("Enter the Book Quantity:");
            int quantity=sc.nextInt();

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,author);
            ps.setInt(4,quantity);
            ps.addBatch();
        }
       int row[]= ps.executeBatch();
       System.out.println(row+" Book added Sucessfully");
       ps.close();

     }catch(Exception e){
        System.out.println("Book addition faild!");
        e.printStackTrace();
     }

}
}