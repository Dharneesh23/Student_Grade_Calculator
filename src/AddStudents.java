import java.util.ArrayList;
import java.util.Scanner;

public class AddStudents {
   // ArrayList<String>student=new ArrayList<>();
    //Scanner scanner = new Scanner(System.in);
       public static void addstudents()
       {
           ArrayList<String>student=new ArrayList<>();
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter how many student : ");
           int studentlist=scanner.nextInt();
           System.out.println("Enter the students name list  :");
         //  String studentname = scanner.next();
           for(int i=1;i<=studentlist;i++)
           {
               String name = scanner.next();
               student.add(name);
           }
           Perform_claculation.claculate(student);
       }



}


