package For_Loop;
import java.util.*;
public class PrimeNumbersAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter value of A:");
        int A = sc.nextInt();
        System.out.println("enter value of B:");
        int B = sc.nextInt();

        System.out.println("Prime Numbers Are:");

        for(int i = A; i <= B; i++)
        {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
