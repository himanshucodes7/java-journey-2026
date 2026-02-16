package For_Loop;
import java.util.*;
public class FactorialMinusSumofFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int factorial = 1;
        int sumOfFactors = 0;

        // Finding factorial
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Finding sum of factors
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sumOfFactors += i;
            }
        }

        int difference = factorial - sumOfFactors;

        System.out.println("Factorial = " + factorial);
        System.out.println("Sum of Factors = " + sumOfFactors);
        System.out.println("Difference = " + difference);

        sc.close();
    }
}
