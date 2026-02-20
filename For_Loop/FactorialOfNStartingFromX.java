package For_Loop;
import java.util.*;
public class FactorialOfNStartingFromX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("enter starting number X:");
       int X = sc.nextInt();
       System.out.println("enter how many numbers N: ");
       int N = sc.nextInt();

       for(int i = X; i < X+N; i++){

        int fact = 1;
        for(int j = 1; j <= i; j++){
            fact *= j;
        }
        System.out.println("Factorial of " + i + " = " + fact);
       }
       sc.close();

    }
}
