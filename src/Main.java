import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book b=new Book();
        issue I=new issue();
        Student S=new Student();
        System.out.println("WELECOME TO STUDENT LIBRARY <HELLO STUDENT HAPPY LEARNING>");
        try{
        while(true){
            System.out.print("Choose:\n 1:Add student \n 2:Add Book \n 3:Issue a Book \n 4:Exit\n");
            int n=sc.nextInt();
            switch(n){
                case 1:S.addStudent();
                break;
                case 2:b.addbook();
                break;
                case 3:I.addissue();
                break;
                case 4:
                    System.out.println("Thank you for visiting!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input! please try again");
                    break;
            }
        }
    }catch(Exception e){
        e.printStackTrace();
    }

    }
    
}
