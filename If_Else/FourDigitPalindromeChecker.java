package If_Else;
import java.util.*;
public class FourDigitPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter four digit number: ");
        int n = sc.nextInt();

        int lastDigit = n % 10;
        int thirdDigit = (n / 10) % 10;
        int secondDigit = (n / 100) % 10;
        int firstDigit = n / 1000;

        int rev = (lastDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + firstDigit;

        if (rev == n) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome number");
        }
        sc.close();
    }
}
