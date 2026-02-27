package SwitchCase;
import java.util.*;
public class ReverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        switch (count) {

            case 5:
                int rev = 0;
                temp = num;

                while (temp > 0) {
                    int digit = temp % 10;
                    rev = rev * 10 + digit;
                    temp = temp / 10;
                }

                System.out.println("Reverse = " + rev);
                break;

            case 4:
                int sum = 0;
                temp = num;

                while (temp > 0) {
                    sum += temp % 10;
                    temp = temp / 10;
                }

                System.out.println("Sum of digits = " + sum);
                break;

            case 3:
                int lastDigit = num % 10;

                temp = num;
                while (temp >= 10) {
                    temp = temp / 10;
                }

                int firstDigit = temp;

                System.out.println("Sum of first and last digit = " + (firstDigit + lastDigit));
                break;

            default:
                System.out.println("Invalid input (only 3,4,5 digit numbers allowed)");
        }

        sc.close();
    }
}
