package For_Loop;
import java.util.*;
public class Factorial28 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number to find its factorial:");
    int n = sc.nextInt();
    long f = 1;
    for(int i = 1; i <= n; i++){
        f = f * i;
    }
    System.out.println("Factorial = " + f);
    sc.close();
   } 
}
