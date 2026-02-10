package If_Else;
import java.util.*;
public class CycleRentEvaluator {
 public static void main(String[] args) {
    try(Scanner sc = new Scanner (System.in)) {
        System.out.println("enter the season: spring or summer or winter or rainy");
    String season = sc.nextLine().trim();
    System.out.println("enter number of days: ");
    int days = sc.nextInt();
    System.out.println("enter number of cycles required: ");
    int cycle =sc.nextInt();

    int rate = 0;
    double amountPay;

    if (season.equalsIgnoreCase("spring")) {
        rate = 5;
    } else if (season.equalsIgnoreCase("summer")) {
        rate = 8;
    } else if (season.equalsIgnoreCase("winter")) {
        rate = 3;
    } else if (season.equalsIgnoreCase("rainy")) {
        rate = 10;
    } else {
        System.out.println("Invalid season entered.");
        return;
    }
    amountPay = rate * days * cycle;
    if (days > 30) {
        amountPay = amountPay - (0.25 * amountPay);
    }
    System.out.println("Rent of the cycle = " + "Rs " + amountPay);
    }
 }   
}
