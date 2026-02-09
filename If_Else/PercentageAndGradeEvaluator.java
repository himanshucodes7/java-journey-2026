package If_Else;
import java.util.*;
public class PercentageAndGradeEvaluator {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter marks of 1st subject: ");
        double m1 = sc.nextDouble();
        System.out.println("enter marks of 2nd subject: ");
        double m2 = sc.nextDouble();
        System.out.println("enter marks of 3rd subject: ");
        double m3 = sc.nextDouble();
        System.out.println("enter marks of 4th subject: ");
        double m4 = sc.nextDouble();
        System.out.println("enter marks of 5th subject: ");
        double m5 = sc.nextDouble();

        double totalMarks = m1 + m2 + m3 + m4 + m5; 
        double percentage = (totalMarks * 100) / 500;

        if (percentage >= 80) {
            System.out.println(percentage + " percentage" + " Grade A");
        } else if (percentage >= 60) {
            System.out.println(percentage + " percentage" + " Grade B");
        } else if (percentage >= 40) {
            System.out.println(percentage + " percentage" + " Grade C");
        } else {
            System.out.println(percentage + " percentage" + " Grade D");
        }
        sc.close();
    }  
}
