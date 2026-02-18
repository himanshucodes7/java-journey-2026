package For_Loop;
import java.util.*;
public class SumOfMultiplesOfInteger { // We can also use the formula:  K * N * (N+1)/2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Integer or Value of K");
        int K = sc.nextInt();
        System.out.println("Enter the number of multiples uyou want or the value of N");
        int N = sc.nextInt();

        int s = 0;
        for(int i = 1; i <= N; i++){
            s += (K * i);
        }
        System.out.println("Sum of multiples of an integer = " + s);
        sc.close();
    }
}
