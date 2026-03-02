package Methods;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum = " + sum);

        sc.close();
    }

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
