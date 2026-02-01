package Basic_Input_Output;
import java.util.*;
public class ProductOfSumDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, sum, diff, product;

        System.out.println("input a number for a :");
        a = sc.nextInt();

        System.out.println("input a number for b :");
        b = sc.nextInt();

        sum = a + b;
        diff = a - b;

        product = sum * diff;
        System.out.println(product);

        sc.close();
    }    
}
