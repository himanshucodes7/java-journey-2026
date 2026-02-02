package Basic_Input_Output;
import java.util.*;
public class TotalAmountForShirts {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the cost for one shirt");
        double markedPrice = sc.nextDouble();

        System.out.println("enter the discount offered:");
        double discountPercent = sc.nextDouble();

        System.out.println("enter the number of shirts required:");
        double quantity = sc.nextDouble();

        double amountPayable = (quantity * markedPrice) - (((markedPrice * discountPercent) / 100) * quantity) ;
        System.out.println("Total amount to pay = " + amountPayable);

        sc.close();
    }
}
