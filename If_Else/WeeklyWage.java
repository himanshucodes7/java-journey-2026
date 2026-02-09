package If_Else;
import java.util.*;
public class WeeklyWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter number of hours worked: ");
        double h = sc.nextDouble();
        System.out.println("enter hourly rate: ");
        double r = sc.nextDouble();
        double pay;

        if (h <= 35) {
            pay = h * r;
        } else if (h <= 55) {
            pay = (35 * r) + ((h - 35) * (1.5 * r));
        } else {
            pay = (35 * r) + (20 * (1.5 * r)) + (h - 55) * (2 * r);
        }
        System.out.println("Weekly wage = " + "Rs " + pay);
        sc.close();
    }
}
