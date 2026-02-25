package While_Loop;
import java.util.*;
public class CheckingTheProductoftwodigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;

        int temp = num;

        while (temp >= 100) {
            temp = temp / 10;
        }

        int firstDigit = temp / 10;
        int firstSecondDigit = temp % 10;

        int p1 = firstDigit * firstSecondDigit;
        int p2 = lastDigit * secondLastDigit;

        if (p1 == p2) {
            System.out.println("Product are same");
        } else {
            System.out.println("Product are not same");
        }
        sc.close();
    }
}
