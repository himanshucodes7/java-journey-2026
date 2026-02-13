package For_Loop;
import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to find its factor:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if (n % i == 0) {
                System.out.print( i + " ");
            }
        }
        sc.close();
    }
}
