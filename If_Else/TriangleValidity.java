package If_Else;
import java.util.*;
public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first side of triangle :");
        double side1 = sc.nextDouble();
        System.out.print("enter second side of triangle :");
        double side2 = sc.nextDouble();
        System.out.print("enter third side of triangle :");
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Sides must be positive and not zero");
        } else if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("not a valid triangle");
        }
        sc.close();
    }
}
