package For_Loop;
import java.util.*;
public class NumberOfFactor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number to find the number of its factors:");
    int n = sc.nextInt();
    int fCount = 0;
    for(int i = 1; i <= n; i++){
        if (n % i == 0) {
            fCount++;
        }
    }
    System.out.println("Number of factor = " + fCount);
    sc.close();
  }  
}
