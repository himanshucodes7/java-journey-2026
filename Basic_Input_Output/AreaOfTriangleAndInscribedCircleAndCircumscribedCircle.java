package Basic_Input_Output;
import java.util.*;
public class AreaOfTriangleAndInscribedCircleAndCircumscribedCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the first side of Triangle");
        int a = sc.nextInt();
        System.out.println("enter the second side of Triangle");
        int b = sc.nextInt();
        System.out.println("enter the third side of triangle:");
        int c = sc.nextInt();

        double s = (a + b + c) / 2.0;
        double AREA = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        double radiusOfCircumscibedCircle = (a * b * c) / (4 * AREA);
        double radiusOfInscribedCircle = AREA / s;

        double areaInscribedCircle = (22 / 7.0) * Math.pow(radiusOfInscribedCircle,2);
        double areaCircumscribedCircle = (22/7.0) * Math.pow(radiusOfCircumscibedCircle, 2);
        
        System.out.println("Area of triangle = " + AREA + "   Area of Inscribed Circle = " + areaInscribedCircle + "   Area of Circumscribed Circle = " + areaCircumscribedCircle);

        sc.close();
    }
}
