package SwitchCase;
import java.util.*;
public class CalculatedResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first operand:");
        int a = sc.nextInt();
        System.out.println("enter second operand:");
        int b = sc.nextInt();
        System.out.println("enter operator: (*, -, +, /)");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '*':
                System.out.println(a * b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '/':
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Wrong operator entered");        
        }
        sc.close();
    }
}
