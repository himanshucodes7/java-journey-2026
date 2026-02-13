package For_Loop;
import java.util.*;
public class PrimenessCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int fCount = 0;
        System.out.println("enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                fCount++;
            }
        }
        if (fCount == 2) {
            System.out.println("The number is Prime.");
        } else {
            System.out.println("Not a Prime Number.");
        }
        sc.close();
    }
}
