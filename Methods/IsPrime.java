package Methods;
import java.util.*;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number to check its primeness:");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime number");
        } else
            System.out.println("Not a Prime number");
        
        sc.close();
    }

    public static boolean isPrime(int num) {

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
