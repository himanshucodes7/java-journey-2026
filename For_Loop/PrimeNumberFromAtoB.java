package For_Loop;
import java.util.*;
public class PrimeNumberFromAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the value of A: ");
        int A = sc.nextInt();
        System.out.print("enter the value of B: ");
        int B = sc.nextInt();

        for(int num = A; num <= B; num++) {
            int count = 0;

            for(int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
