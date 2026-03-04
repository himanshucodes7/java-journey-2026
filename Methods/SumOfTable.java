package Methods;
import java.util.*;
public class SumOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number to print its table sum:");
        int n = sc.nextInt();

        int sum = sumOfTable(n);
        System.out.println("Sum of table = " + sum);
        sc.close();
    }

    public static int sumOfTable (int n) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += (n * i);
        }
        return sum;
    }
}
