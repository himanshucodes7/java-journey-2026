package While_Loop;
import java.util.*;
public class AverageOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double evenAvg, oddAvg;
        int evenCount = 0, oddCount = 0;
        int sumEven = 0, sumOdd = 0;

        System.out.println("enter a number: (enter 1000 to stop!)");
        int n = sc.nextInt();

        while (n != 1000) {

            if (n % 2 == 0) {
                evenCount++;
                sumEven += n;
            } else {
                oddCount++;
                sumOdd += n;
            }
            n = sc.nextInt();
        }
        if (evenCount != 0) {
            evenAvg = (double) sumEven / evenCount;
            System.out.println("Average of even numbers = " + evenAvg);
        } else {
            System.out.println("no even numbers entered.");
        }

        if (oddCount != 0) {
            oddAvg = (double) sumOdd / oddCount;
            System.out.println("Average of odd numbers = " + oddAvg);
        } else {
            System.out.println("no odd numbers entered.");
        }

        sc.close();
    }
}
