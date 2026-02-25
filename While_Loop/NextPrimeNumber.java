package While_Loop;
import java.util.*;
public class NextPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        n = n + 1;
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Next Prime Number = " + n);
                break;
            }
            n++;
        }
        sc.close();
    }
}
