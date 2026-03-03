package Methods;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);

        System.out.println("Enter a number to find its factorial:");
        int n = sc.nextInt();

        int f = factorialOf(n);
        System.out.print("Factorial = " + f);
        sc.close();
    }

    public static int factorialOf(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
}
