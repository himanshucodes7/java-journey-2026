package Methods;
import java.util.*;
public class ShirtPriceEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of shirts needed:");
        int n = sc.nextInt();
        System.out.println("Enter the price for one shirt:");
        int price = sc.nextInt();
        System.out.println("Enter the discount in percentage:");
        int dis = sc.nextInt();

        double amount = evaluatePrice(n, price, dis);
        System.out.print("Total amount to pay = Rs" + amount);
        sc.close();
    }

    public static double evaluatePrice(int n, int price, int dis) {

        double sp = price - (dis / 100.0 * price);
        double amount = n * sp;
        return amount;
    }
}
