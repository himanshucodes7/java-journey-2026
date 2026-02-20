package For_Loop;
import java.util.*;
public class IsFacorsArePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter a number: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) // here i havent started loop from 1 as 1 is a factor but not a prime.
        {
            if (num % i == 0) {
                
                int count = 0;
                for (int j = 1; j <= i; j++)
                {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
