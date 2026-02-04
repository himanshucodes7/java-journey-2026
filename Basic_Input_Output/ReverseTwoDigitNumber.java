package Basic_Input_Output;
import java.util.*;
public class ReverseTwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a two-digit number:");
        int n = sc.nextInt();

        int lastDigit = n % 10;
        int firstDigit = n / 10;

        int reverse = (lastDigit * 10) + firstDigit;
        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}
