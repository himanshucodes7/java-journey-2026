package Basic_Input_Output;
import java.util.*;
public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter three digit number:");
        int n = sc.nextInt();

        int lastDigit = n % 10;
        int midDigit = (n / 10) % 10;
        int firstDigit = (n / 100) % 10;
        
        int reverse = (lastDigit * 100) + (midDigit * 10) + firstDigit;
        System.out.println("Reverse three digit number = " + reverse);

        sc.close();
    }
}
