package While_Loop;
import java.util.*;
public class First20PrimeNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 2;
        int count = 0;

        while (count < 20) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        sc.close();
    }
}
