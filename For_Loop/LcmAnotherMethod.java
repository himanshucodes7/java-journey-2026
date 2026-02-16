package For_Loop;
import java.util.*;
public class LcmAnotherMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        int min, hcf = 1;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        for(int i = min; i >= 1; i--){
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break;
            }
        }

        double lcm = (a * b) / hcf;
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
