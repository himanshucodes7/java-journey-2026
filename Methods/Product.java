package Methods;
import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        int prod = productOf(a, b);
        System.out.println("Product = " + prod);
        sc.close();
    }

    public static int productOf(int a, int b) {
        int prod = a * b;
        return prod;
    }
}
