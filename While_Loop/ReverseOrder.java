package While_Loop;
import java.util.*;
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter a number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
        sc.close();
    }
}
