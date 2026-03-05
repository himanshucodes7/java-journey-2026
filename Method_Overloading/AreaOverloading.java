package Method_Overloading;
import java.util.*;
public class AreaOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println("enter the value of c");
        int c = sc.nextInt();
        System.out.println("enter the height:");
        int h = sc.nextInt();
        System.out.println("enter diagonal 1:");
        int d1 = sc.nextInt();
        System.out.println("enter diagonal 2:");
        int d2 = sc.nextInt();

        double areaScaleneTRiangle = area(a, b, c);
        double areaTrapezium = area(a, b, h);
        double areaRhombus = area(d1, d2);

        System.out.println("Area of Scalene Triangle = " + areaScaleneTRiangle);
        System.out.println("Area of Trapezium = " + areaTrapezium);
        System.out.println("Area of Rhombus = " + areaRhombus);

        sc.close();
    }

    public static double area (double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        double result = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return result;
    }

    public static double area (int a, int b, int height) {
        double area = 0.5 * height * (a + b);
        return area;
    }

    public static double area (double diagona1, double diagonal2) {
        double area = 0.5 * (diagona1 * diagonal2);
        return area;
    }
}
