package For_Loop;
import java.util.*;
public class FormulaValueEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value for n:");
        int n = sc.nextInt();
        System.out.println("enter the value for r:");
        int r = sc.nextInt();

        long f1 = 1, f2 = 1, f3 = 1;

        for(int i = 1; i <= n; i++) {
            f1 *= i;
        }

        for(int j = 1; j <= r; j++) {
            f2 *= j;
        }

        for (int k = 1; k <= (n-r); k++){
            f3 *= k;
        }

        double result = f1 / (f3 * f2);
        System.out.println("Value of the formula = " + result);
        sc.close();
    }
}
