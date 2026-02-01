package Basic_Input_Output;
import java.util.*;
public class CubeOfSquareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double sqroot = Math.sqrt(num);
        double cube = Math.pow(sqroot, 3);

        System.out.println("Cube of square root of a number = " + cube);

        sc.close();
    }
}
