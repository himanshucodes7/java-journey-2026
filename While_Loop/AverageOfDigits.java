package While_Loop;
import java.util.*;
public class AverageOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        double avg;
        int count = 0, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            count++;
            sum += digit;
            num = num / 10;
        }
        if(count != 0) {
            avg = (double) sum / count;
            System.out.println("Average of digits = " + avg);
        } else {
            System.out.println("No digits to calculate average.");
        }
        sc.close();
    }
}
