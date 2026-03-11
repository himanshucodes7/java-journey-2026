package Array;
import java.util.*;
public class MeanDeviationOfEachNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a[] = new int[10];
        int i, sum = 0;
        double avg;

        for (i = 0; i < 10; i++) {

            System.out.println("enter a number:");
            a[i] = sc.nextInt();

            sum += a[i];
        }
        avg = sum / 10.0;

        for (i = 0; i < 10; i++) {
            System.out.println("Mean deviation of " + a[i] + " = " + (a[i] - avg));
        }
        sc.close();
    }
}
