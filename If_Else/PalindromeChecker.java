package If_Else;
import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     int r, lastDigit, midDigit, firstDigit;
     System.out.println("enter three digit number: ");
     int n = sc.nextInt();

     lastDigit = n % 10;
     midDigit = (n / 10) % 10;
     firstDigit = n / 100;

     r = (lastDigit * 100) + (midDigit * 10) + firstDigit;

     if (r == n) {
        System.out.println("Palindrome Number");
     } else {
        System.out.println("Not a Palindrome Number");
     }
     sc.close();
    }
}
