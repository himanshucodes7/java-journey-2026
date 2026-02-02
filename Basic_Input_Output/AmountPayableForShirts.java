package Basic_Input_Output;
import java.util.*;
public class AmountPayableForShirts {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the number of shirts need to purchase:");
        int shirtsNeeded = sc.nextInt();

        double discountedPriceforEachShirt = 500 - (0.125 * 500);
        double AmountPayable = shirtsNeeded * discountedPriceforEachShirt;
        
        System.out.println("Amount Payable after discount on each shirt = " + AmountPayable);

        sc.close();
    }
}
