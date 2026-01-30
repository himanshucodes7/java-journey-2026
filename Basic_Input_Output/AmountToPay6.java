package Basic_Input_Output;
import java.util.*;
public class AmountToPay6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the marked price of two wheeler:");
        double markedPrice = sc.nextDouble();

        System.out.println("enter the discount:");
        double discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent * markedPrice) / 100.0;
        double finalAmount = markedPrice - discountAmount;
        System.out.println("Total amount to pay = " + finalAmount); 

        sc.close();
    }
}
