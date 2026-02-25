package While_Loop;
import java.util.*;
public class BiggestAndSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        int biggest = 0, smallest = 9;
        while (n != 0) {
            int digit = n % 10;
            if (digit > biggest) {
                biggest = digit;
            }
            if (digit < smallest) {
                smallest = digit;
            }
            n /= 10;
        }
        System.out.println("Smallest = " + smallest + " Biggest = " + biggest);
        sc.close();
    }
}
