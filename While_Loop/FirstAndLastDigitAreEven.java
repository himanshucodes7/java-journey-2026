package While_Loop;
import java.util.*;
public class FirstAndLastDigitAreEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        int lastDigit = n % 10;
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        if (firstDigit % 2 == 0 && lastDigit % 2 == 0) {
            System.out.println("The first and last digit both are even.");
        } else {
            System.out.println("First and last digit are not even.");
        }
        sc.close();
    }
}
