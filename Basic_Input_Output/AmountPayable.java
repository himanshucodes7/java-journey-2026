package Basic_Input_Output;
import java.util.*;
public class AmountPayable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the amount of purchase: ");
        int markedPrice = sc.nextInt();

        double firstDiscountedPrice = markedPrice - ((50 * markedPrice) / 100.0);
        double finalDiscountedPrice = firstDiscountedPrice - ((40 * firstDiscountedPrice) / 100.0);

        System.out.println("Amount Payable after discounts = " + finalDiscountedPrice);

        sc.close();
    }
}
