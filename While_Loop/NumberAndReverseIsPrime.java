package While_Loop;
import java.util.*;
public class NumberAndReverseIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int num = sc.nextInt();
        int temp = num, rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        int count1 = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count1++;
            }
        }
        
        int count2 = 0;
        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0) {
                count2++;
            }
        }
        if (count1 == 2 && count2 == 2) {
            System.out.println("The number and its reverse both are prime and number is: " + num + " and " + rev);
        } else {
            System.out.println("The number and its reverse are not prime.");
        }
        sc.close();
    }
}
