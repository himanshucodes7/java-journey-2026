package Method_Overloading;
import java.util.*;
public class SumOverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        System.out.println("enter third number:");
        int c = sc.nextInt();

        int sum1 = sumOf(a, b);
        int sum2 = sumOf(a, b, c);

        System.out.println("Sum of two numbers = " + sum1);
        System.out.println("Sum of three numbers = " + sum2);
        sc.close();
    }

    public static int sumOf (int a, int b) {
        return (a + b);
    }

    public static int sumOf (int a, int b, int c) {
        return (a + b + c);
    }
}
