package Basic_Input_Output;
import java.util.*;
public class CubeOfSqrootCuberootSqroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the number:");
        double num = sc.nextDouble();

        // Here we evaluated the exponential and reduced it and we are not using the long form and not calling multiple methods.
        // reducing it to n^(1/4) and implemented it as Math.sqrt(Math.sqrt(n))
        //double sqroot = (Math.sqrt(Math.cbrt(Math.sqrt(num))));
        //double cube = Math.pow(sqroot, 3);

        double cube = Math.sqrt(Math.sqrt(num));

        System.out.println("Cube of square root of cube root of square root = " + cube);

        sc.close();
    }
}
