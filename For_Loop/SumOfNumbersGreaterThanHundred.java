package For_Loop;
import java.util.*;
public class SumOfNumbersGreaterThanHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        for(int i = 1; i <= 20; i++) {
            System.out.println("enter a number:");
            int n = sc.nextInt();
            if (n > 100) {
                sum += n;
            }
        }
        System.out.println("sum of numbers greater than 100 = " + sum);
        sc.close();
    }
}
