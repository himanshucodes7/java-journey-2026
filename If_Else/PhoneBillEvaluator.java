package If_Else;
import java.util.*;
public class PhoneBillEvaluator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {
            double bill;
        System.out.println("enter number of calls: ");
            int calls = sc.nextInt();

        if (calls < 0) {
         System.out.println("Invalid number of calls");
         return;
        }

        if (calls <= 180) {
            bill = 400;
        } else if (calls <= 500) {
            bill = 400 + (calls - 180) * 1.33;
        } else if (calls <= 1500) {
            bill = 400 + (320 * 1.33) + (calls - 500) * 1.80;
        } else {
            bill = 400 + (320 * 1.33) + (1000 * 1.80) + (calls - 1500) * 0.80;
        }
        System.out.println("Phone bill = " + "Rs " + bill);
        }
    }
}
