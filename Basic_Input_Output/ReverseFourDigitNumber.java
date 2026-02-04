package Basic_Input_Output;
import java.util.*;
public class ReverseFourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter four digit number:");
        int n = sc.nextInt();

        int lastDigit = n % 10;
        n = n / 10;
        int thirdDigit = n % 10;
        n = n / 10;
        int secondDigit = n % 10;
        n = n / 10;
        int firstDigit = n % 10;
        
        int reverse = (lastDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + firstDigit;
        System.out.println("Reverse of four digit number = " + reverse);

        sc.close();
    }
}
