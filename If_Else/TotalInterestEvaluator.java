package If_Else;
import java.util.*;
public class TotalInterestEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter principal:");
        int p = sc.nextInt();
        System.out.println("enter time");
        int t = sc.nextInt();
        System.out.println("Enter choice: 1 for yearly interest and 2 for cumulative interest:");
        int choice = sc.nextInt();
        double rate = 0;

        if (t <= 1) {
            rate = 6;
        } else if (t <= 2) {
            rate = 8;
        } else {
            rate = 10;
        }

        double interest = 0;

        if (choice == 1) {
            interest = (p * rate * t) / 100;
            System.out.println("Total interest (yearly payout) = " + interest);
        } else if (choice == 2) {
            double amount = p * Math.pow((1 + rate / 100), t);
            interest = amount - p;
            System.out.println("Total interest (cumulative interest) = " + interest);
        } else {
            System.out.println("Invalid scheme choice.");
        }
        sc.close();
    }
}
