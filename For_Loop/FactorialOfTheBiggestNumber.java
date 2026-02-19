package For_Loop;
import java.util.*;
public class FactorialOfTheBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int big = sc.nextInt();

        long f = 1;

        for(int i = 1; i <= 19; i++) {
            System.out.println("enter a number:");
            int n = sc.nextInt();

            if (n > big) {
                big = n;
            }
        }
        for(int i = 1; i <= big; i++) {
            f *= i;
        }

        System.out.println("Factorial of biggest number = " + f);
        sc.close();
    }
}
