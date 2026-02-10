package If_Else;
import java.util.*;
public class TriangleType {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {
            System.out.println("enter first side: ");
            int a = sc.nextInt();
            System.out.println("enter second side: ");
            int b = sc.nextInt();
            System.out.println("enter third side: ");
            int c = sc.nextInt();

            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Invalid triangle.");
                return;
            }
            if (a == b && b == c) {
                System.out.println("Equilateral triangle.");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle.");
            }
        }
    }
}
