package For_Loop;
import java.util.*;
public class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number to find the sum of its factor:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Factor = " + sum);
        sc.close();
    }
}
