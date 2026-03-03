package Methods;
import java.util.*;
public class ReverseFinderThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a three digit number:");
        int num = sc.nextInt();

        int result = reverseFinder(num);
        System.out.println("Reverse of 3 digit number = " + result);
        sc.close();
    }

    public static int reverseFinder (int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}
