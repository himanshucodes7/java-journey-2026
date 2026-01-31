package Basic_Input_Output;
import java.util.*;
public class SumProductDifference_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, c, sum, product, difference;

        System.out.println("enter a number for a:");
        a = sc.nextInt();

        System.out.println("enter a number for b:");
        b = sc.nextInt();

        System.out.println("enter a number for c:");
        c = sc.nextInt();

        sum = a + b + c;
        difference = a - b - c;
        product = a * b * c;

        System.out.println("Sum = " + sum + " Difference = " + difference + " Product = " + product);
        sc.close();
    }
}
