package While_Loop;
import java.util.*;
public class IsSpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number to check is the number special or not:");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int f = 1;
            int digit = n % 10;
            for (int i = 1; i <= digit; i++) {
                f *= i;
            }
            sum += f;
            n /= 10;
        }
        if (sum == original) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a special number");
        }
        sc.close();
    }
}
