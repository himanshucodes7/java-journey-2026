package For_Loop;
import java.util.*;
public class SumOfTableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        System.out.println("enter a number:");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
             sum += (n * i);
        }
        System.out.println("sum of table of a number = " + sum);
        sc.close();
    }
}
