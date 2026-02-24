package While_Loop;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int x, sum = 0;

        while (n != 0)
        {
            x = n % 10;
            sum = sum + x;
            n = n / 10;
        }
        System.out.println ("sum of digits = " + sum);
        sc.close();
    }
}
