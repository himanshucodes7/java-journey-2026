package If_Else;
import java.util.*;
public class TriangleValidationThroughAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first angle of triangle: ");
        double a = sc.nextDouble();

        System.out.println("enter second angle of triangle: ");
        double b = sc.nextDouble();

        System.out.println("enter third angle of triangle: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Angle cannot be negative");
        } else if (a + b + c == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a valid triangle");
        }
        sc.close();
    }
}
