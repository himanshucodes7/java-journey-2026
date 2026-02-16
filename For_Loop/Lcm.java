package For_Loop;
import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        int max, lcm = 0;
        if (a < b) {
            max = a;
        } else {
            max = b;
        }
        
        for(int i = max; i <= (a*b) ; i++){
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("Lcm of two number = " + lcm);
        sc.close();
    }
}
