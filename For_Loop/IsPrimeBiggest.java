package For_Loop;
import java.util.*;
public class IsPrimeBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int big = sc.nextInt();  // first number assumed biggest

        int count = 0;

        for(int i = 1; i <= 19; i++){

            System.out.println("enter a number");
            int n = sc.nextInt();  

            if (n > big) {
                big = n;
            }
        }
         for(int j = 1; j <= big; j++) {
                if (big % j == 0)
                    count++;
            }
            
        if (count == 2) {
            System.out.println("Biggest number (" + big + ") is Prime");
        } else {
            System.out.println("Biggest number (" + big + ") is not Prime");
        }

        sc.close();
        
    }
}
