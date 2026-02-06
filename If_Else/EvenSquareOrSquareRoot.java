package If_Else;
import java.util.*;
public class EvenSquareOrSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Square = " + (n * n));
        } else {
            System.out.println("Square root = " + Math.sqrt(n));
        }
        sc.close();
    }
}
