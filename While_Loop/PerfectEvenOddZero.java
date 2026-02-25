package While_Loop;
import java.util.*;
public class PerfectEvenOddZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        for (int i = 1000; i <= 100000; i++)
        {
            int n = i;
            int oddCount = 0, evenCount = 0, zeroCount = 0;

            while (n != 0) {
                int digit = n % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                } else if (digit == 0) {
                    zeroCount++;
                } else {
                    oddCount++;
                }
                n /= 10;
            }
            if (zeroCount == 2) {
                System.out.println("Perfect zero number: " + i);
            }
            if (evenCount == 2) {
                System.out.println("Perfect even number: " + i);
            }
            if (oddCount == 2) {
                System.out.println("Perfect odd number: " + i);
            }
        }
        sc.close();
    }    
}
