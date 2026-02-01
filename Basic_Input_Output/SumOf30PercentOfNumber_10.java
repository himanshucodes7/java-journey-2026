package Basic_Input_Output;
import java.util.*;
public class SumOf30PercentOfNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("enter first number:");
        a = sc.nextInt();
        System.out.println("enter second number:");
        b = sc.nextInt();
        
        double percentageOfA = (30 * a) / 100.0;
        double percentageOfB = (30 * b) / 100.0;

        double sum = percentageOfA + percentageOfB;
        System.out.println("Sum of 30 Percent of each number = " + sum);

        sc.close();
    }
}
