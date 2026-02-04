package Basic_Input_Output;
import java.util.*;
public class SwappingTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int c;

        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter second number:");
        int b = sc.nextInt();

        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping :");
        System.out.println("first number = " + a);
        System.out.println("second number = " + b);

        sc.close();
    }
}
