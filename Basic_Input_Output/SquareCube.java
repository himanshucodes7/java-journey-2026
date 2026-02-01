package Basic_Input_Output;
import java.util.*;
public class SquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a, sqr, cube;
        System.out.println("enter a number for a:");
        a = sc.nextInt();

        sqr = a * a;
        cube = a * a * a;

        System.out.println("Square = " + sqr +  " Cube = " + cube);

        sc.close();
    }
}
