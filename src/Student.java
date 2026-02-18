import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Student {
      public void addStudent(){
        Scanner sc=new Scanner(System.in);
        String sql="insert into student(student_id,name,course) values (?,?,?)";
        try{
            Connection con=DBconnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            System.out.println("Enter the number of student do you want to enter:");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter the student ID:");
                int Id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Student Name");
                String name=sc.nextLine();
                System.out.println("Enter the Student Course:");
                String course=sc.nextLine();
                ps.setInt(1,Id);
                ps.setString(2,name);
                ps.setString(3,course);
                ps.addBatch();
            }
            int[] row=ps.executeBatch();
            System.out.println(row.length+" Student add Successfully.");
            ps.close();

        }catch(Exception e){
            System.out.println("Student insertion faild!");
        e.printStackTrace();
        }
      }
    
}
