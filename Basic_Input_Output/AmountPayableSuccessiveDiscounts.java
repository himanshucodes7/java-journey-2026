package Basic_Input_Output;
import java.util.*;
public class AmountPayableSuccessiveDiscounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the amount of purchase:");
        double markedPrice = sc.nextDouble();

        double priceAfterFirstDiscount = markedPrice - (0.40 * markedPrice);
        double priceAfterSecondDiscount = priceAfterFirstDiscount - (0.40 * priceAfterFirstDiscount);
        double priceAfterThirdDiscount = priceAfterSecondDiscount - (0.20 * priceAfterSecondDiscount);

        System.out.println("Amount Payable after three successive discounts = " + priceAfterThirdDiscount);

        sc.close();
    }
}
