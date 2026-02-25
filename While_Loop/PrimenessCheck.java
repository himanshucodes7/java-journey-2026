package While_Loop;
import java.util.*;
public class PrimenessCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number to check its primeness and enter 500 to terminate the program:");
        int num = sc.nextInt();

        while (num != 500) {
            int count = 0;
            if (num > 1) {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println("Prime number : " + num);
                }
            }
            num = sc.nextInt();
        }
        sc.close();
    }
}
