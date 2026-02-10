package If_Else;
import java.util.*;
public class TriangleCategory {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {

            System.out.println("enter first angle: ");
            int a = sc.nextInt();
            System.out.println("enter second angle: ");
            int b = sc.nextInt();
            System.out.println("enter third angle: ");
            int c = sc.nextInt();

            // First we check the validity of triangle:
            if (a <= 0 || b <= 0 || c <= 0 || a + b + c != 180) {
                System.out.println("Not a valid triangle.");
                return;
            }

            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Right angled triangle");
            } else if (a > 90 || b > 90 || c > 90) {
                System.out.println("Obtuse triangle");
            } else {
                System.out.println("Acute triangle");
            }
        }
    }
}
