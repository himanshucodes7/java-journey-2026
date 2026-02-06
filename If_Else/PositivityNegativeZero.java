package If_Else;
import java.util.*;
public class PositivityNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        if (n > 0 ) {
            System.out.println("Positive number");
        } else if (n == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative number");
        }
        sc.close();
    }
}
