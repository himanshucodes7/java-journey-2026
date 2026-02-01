package Basic_Input_Output;
import java.util.*;
public class AreaOfTriangle_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter the first side of triangle:");
        int a = sc.nextInt();

        System.out.println("enter the second side:");
        int b = sc.nextInt();

        System.out.println("enter the third side = ");
        int c = sc.nextInt();

        double s = (a + b + c) / 2.0;
        double area = (s * (s-a) * (s-b) * (s-c));

        System.out.println("area of triangle = " + area);

        sc.close();
    }
}
