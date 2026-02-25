package While_Loop;
import java.util.*;
public class CountOfPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter a number: (enter 0 to terminate or exit the program)");
        int num = sc.nextInt();

        int positiveCount = 0, negativeCount = 0;

        while (num != 0) {
            if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            num = sc.nextInt();
        }
        if (positiveCount > 0) {
            System.out.println("Number of positive number entered = " + positiveCount);
        } else {
            System.out.println("No positive number entered.");
        }

        if (negativeCount > 0) {
            System.out.println("Number of negative number entered = " + negativeCount);
        } else {
            System.out.println("No negative number entered.");
        }
        sc.close();
    }
}
