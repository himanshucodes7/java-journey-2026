package For_Loop;
import java.util.*;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the value of A: ");
        int A = sc.nextInt();
        System.out.print("enter the value of B: ");
        int B = sc.nextInt();

        System.out.println("Perfect Numbers are:");

        for(int i = A; i <= B; i++)
        {
            int sum = 0;

            for(int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
