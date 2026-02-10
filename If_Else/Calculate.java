package If_Else;
import java.util.*;
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two operands: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter a operator: (* , - , + , /) ");
        char operator = sc.next().charAt(0);

        if (operator == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        }
        else if (operator == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        }
        else if (operator == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
        else if (operator == '/') {

            if (b == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        }
        else {
            System.out.println("Invalid operator entered.");
        }
        sc.close();
    }
}
