package If_Else;
import java.util.*;
public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();
        System.out.println("enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("Descending Order: " + a + " > " + b + " > " + c);
            } else {
                System.out.println("Descending Order: " + a + " > " + c + " > " + b);
            } 
        } else if (b >= a && b >= c) {
            if (c >= a) {
                System.out.println("Descending Order: " + b + " > " + c + " > " + a);
            } else {
                System.out.println("Descending Order: " + b + " > " + a + " > " + c);
            }
        }else {
            if (a >= b) {
                System.out.println("Descending Order: " + c + " > " + a + " > " + b);
            } else {
                System.out.println("Descending Order: " + c + " > " + b + " > " + a);
            }
        }
        sc.close();
    }
}
