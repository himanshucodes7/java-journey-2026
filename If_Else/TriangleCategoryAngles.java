package If_Else;
import java.util.*;
public class TriangleCategoryAngles {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {
        
        System.out.println("Enter first angle: ");
        int a = sc.nextInt();
        System.out.println("Enter second angle: ");
        int b = sc.nextInt();
        System.out.println("Enter third angle: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 || (a + b + c) != 180) {
            System.out.println("Invalid triangle.");
            return;
        }
        if (a == b && b == c) {
            System.out.println("Equilateral triangle.");
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
        }
    }
}
