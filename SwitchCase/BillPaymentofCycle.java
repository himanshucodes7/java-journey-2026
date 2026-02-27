package SwitchCase;
import java.util.*;
public class BillPaymentofCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter season (1-Spring, 2-Summer, 3-Winter, 4-Rainy): ");
        int season = sc.nextInt();

        System.out.println("Enter number of cycles hired: ");
        int cycles = sc.nextInt();

        System.out.println("Enter number of days hired: ");
        int days = sc.nextInt();

        int rentPerDay = 0;

        switch (season) {

            case 1:
                rentPerDay = 5;
                break;

            case 2:
                rentPerDay = 8;
                break;

            case 3:
                rentPerDay = 3;
                break;

            case 4:
                rentPerDay = 10;
                break;

            default:
                System.out.println("Invalid Season");
                sc.close();
                return;
        }

        int total = cycles * days * rentPerDay;

        if (days > 30) {
            double discount = total * 0.25;
            total = (int)(total - discount);
        }

        System.out.println("Total amount to be paid = Rs " + total);

        sc.close();
    }
}
