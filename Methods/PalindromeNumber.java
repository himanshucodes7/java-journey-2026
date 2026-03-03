package Methods;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }

    public static boolean isPalindrome (int n) {
        if (n < 0) {
            return false; // this is for negative numbers(edge case)
        }
        
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        return (rev == n);

    }
}
