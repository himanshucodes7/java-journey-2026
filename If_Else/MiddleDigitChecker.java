package If_Else;
import java.util.*;
public class MiddleDigitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first three digit number:");
        int num1 = sc.nextInt();
        System.out.println("enter second three digit number:");
        int num2 = sc.nextInt();

        int middleFirst = (num1 / 10) % 10;
        int middleSecond = (num2 / 10) % 10;

        if (middleFirst == middleSecond) {
            System.out.println("Middle digits are same and numbers are: " + num1 + " , " + num2);
        } else {
            System.out.println("Middle digit are not same.");
        }
        sc.close();
    }
}
