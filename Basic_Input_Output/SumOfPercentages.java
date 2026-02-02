package Basic_Input_Output;
import java.util.*;
public class SumOfPercentages {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();

        System.out.println("enter the percentage value for first number");
        double x = sc.nextDouble();
        System.out.println("enter the percentage value of second number");
        double y = sc.nextDouble();

        double sum = ((x * a) / 100.0) + ((y * b) / 100.0);
        System.out.println("Sum of " + x + " percentage of first number and " + y + " percentage of second number = " + sum);
        sc.close();
    }
}
