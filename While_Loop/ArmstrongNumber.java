package While_Loop;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        int original = n;

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit,3);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }
}
