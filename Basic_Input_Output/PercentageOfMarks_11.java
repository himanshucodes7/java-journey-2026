package Basic_Input_Output;
import java.util.*;
public class PercentageOfMarks_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int s1, s2, s3, s4, s5;
        double marksPercentage;

        System.out.println("enter the marks for 1st subject:");
        s1 = sc.nextInt();
        System.out.println("enter the marks for 2nd subject:");
        s2 = sc.nextInt();
        System.out.println("enter the marks for 3rd subject:");
        s3 = sc.nextInt();
        System.out.println("enter the marks for 4th subject:");
        s4 = sc.nextInt();
        System.out.println("enter the marks for 5th subject:");
        s5 = sc.nextInt();

        int marksSum = s1 + s2 + s3 + s4 + s5;
        marksPercentage = (marksSum * 100) / 500;
        System.out.println("Total percentage secure = " + marksPercentage);

        sc.close();
    }
}
