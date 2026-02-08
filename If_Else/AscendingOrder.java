package If_Else;
import java.util.*;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();
        System.out.println("enter third number ");
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Ascending order: " + a + " < " + b + " < " + c );
            } else {
                System.out.println("Ascending order: " + a + " < " + c + " < " + b );
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Ascending order: " + b + " < " + a + " < " + c );
            } else {
                System.out.println("Ascending order: " + b + " < " + c + " < " + a );
            }
        } else {
            if (b <= a) {
                System.out.println("Ascending order: " + c + " < " + b + " < " + a);
            } else {
                System.out.println("Ascending order: " + c + " < " + a + " < " + b);
            }
        }
        sc.close();
    }
}
