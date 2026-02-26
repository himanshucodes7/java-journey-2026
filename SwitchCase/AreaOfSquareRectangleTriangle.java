package SwitchCase;
import java.util.*;
public class AreaOfSquareRectangleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: (1 - Area of square, 2 - Area of rectangle, 3 - Area of triangle) : ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("enter side of square:");
                double side = sc.nextDouble();
                System.out.println("Area of Square = " + (side * side));
                break;
            case 2:
                System.out.println("enter length of rectangle:");
                double length = sc.nextDouble();
                System.out.println("enter breadth of rectangle:");
                double breadth = sc.nextDouble();
                System.out.println("Area of rectangle = " + (length * breadth));
                break;
            case 3:
                System.out.println("enter the base of triangle:");
                double base = sc.nextDouble();
                System.out.println("enter height of triangle:");
                double height = sc.nextDouble();
                System.out.println("Area of triangle = " + (0.5 * base * height));
                break;
            default:
                System.out.println("wrong choice entered.");            
        }
        sc.close();
    }
}
