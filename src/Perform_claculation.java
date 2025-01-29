import java.util.ArrayList;
import java.util.Scanner;

public class Perform_claculation {
    public static void claculate(ArrayList<String>student) {
        cal:while (true) {
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the student name :");
            String name = scanner.next();
            for (String stu : student) {
                if (name.equals(stu)) {
                    System.out.println("  Calculate the Student marks claculation ");
                    System.out.println("Enter how many subjects");
                    int subjects = scanner.nextInt();
                    int[] entry = new int[subjects];
                    for (int i = 0; i < entry.length; i++) {

                        System.out.println("Enter the mark:");
                        entry[i] = scanner.nextInt();
                        sum += entry[i];
                    }
                    System.out.println("Total mark = " + sum);
                    System.out.println();
                    Average(sum, subjects);
                    break cal;
                }else {
                    System.out.println("Student is not fount ");
                }
                }
                }

    }
    public static void Average(int sum,int subjects)
    {
        float avg= (float) sum /subjects;
        System.out.println("Average mark ="+avg);
        Grade(avg);
    }
    public static void Grade(float avg)
    {
        if(avg>=90)
        {
            System.out.println("Grade A+ ");

        } else if (avg>=80) {
            System.out.println("Grade A ");
        } else if (avg>=70) {
            System.out.println("Grade B+ ");
        } else if (avg>=60) {
            System.out.println("Grade B ");
        } else if (avg>=50) {
            System.out.println("Grade C+ ");
        } else if (avg>=40) {
            System.out.println("Grade C ");
        }else {
            System.out.println("Fail");
        }
    }

}
