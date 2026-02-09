package If_Else;
import java.util.*;
public class IncomeTaxPay {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner (System.in)) {
        double taxPay = 0;
    System.out.println("enter your net yearly income: ");
    int income = sc.nextInt();

    if (income < 0) {
        System.out.println("income cannot be negative");
        return;
    }
    if (income <= 250000) {
        taxPay = 0;
    } else if (income <=500000) {
        taxPay = 0.10 * (income - 250000);
    } else if (income <= 1000000) {
        taxPay = 25000 + (0.20 * (income - 500000));
    } else {
        taxPay = 125000 + (0.30 * (income - 1000000));
    }
    System.out.println("Tax Payable = " + " Rs " + taxPay);
    }
  }  
}
