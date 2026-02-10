package If_Else;
import java.util.*;
public class TelegramBillEvaluator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {
            System.out.println("enter number of words in a telegram: ");
        int words = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the telegram categories: Ordinary or Express or Electronic");
        String category = sc.nextLine().trim();

        if (words < 0) {
            System.out.println("Invalid number of words.");
            return;
        }
        int ordinaryCost = 20;

        if (words > 25) {
            ordinaryCost += (words - 25) * 2;
        }

        int finalAmount;
        if (category.equalsIgnoreCase("Ordinary")) {
            finalAmount = ordinaryCost;
        } else if (category.equalsIgnoreCase("Express")) {
            finalAmount = ordinaryCost * 2;
        } else if (category.equalsIgnoreCase("Electronic")) {
            finalAmount = ordinaryCost * 4;
        } else {
            System.out.println("Invalid telegram type.");
            return;
        }
        System.out.println("Amount to be paid = Rs " + finalAmount);
        }
    }
}
