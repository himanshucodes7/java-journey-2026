package For_Loop;
import java.util.*;
public class ProductOfEvenNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter starting point: ");
        int A = sc.nextInt();
        System.out.println("enter ending point: ");
        int B = sc.nextInt();
        double  p = 1;
        for(int i = A; i <= B; i++) {
            p *= i;
        }
        System.out.println("Product of all numbers = " + p);
        sc.close();
    }
}
