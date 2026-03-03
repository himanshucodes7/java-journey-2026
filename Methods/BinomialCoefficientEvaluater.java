package Methods;
import java.util.*;
public class BinomialCoefficientEvaluater {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the value of r");
        int r = sc.nextInt();

        int result = binCoefficientOf(n, r);
        System.out.println("Binomial coefficint = " + result);
        sc.close();
    }

    public static int binCoefficientOf(int n, int r) {
        int factN = factorialOf(n);
        int factR = factorialOf(r);
        int factNR = factorialOf(n-r);

        int ncr = factN / (factNR * factR);

        return ncr;
    }

    public static int factorialOf(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
}
