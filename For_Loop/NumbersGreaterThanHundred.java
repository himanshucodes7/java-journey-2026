package For_Loop;
import java.util.*;
public class NumbersGreaterThanHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count = 0;
        for(int i = 1; i <= 20; i++) {
            System.out.println("enter a number");
            int n = sc.nextInt();
            if (n > 100) {
              count++;  
            }
        }
        System.out.println("total number greater than 100 = " + count);
        sc.close();
    }
}
