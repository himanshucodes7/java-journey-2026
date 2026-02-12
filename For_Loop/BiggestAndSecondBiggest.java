package For_Loop;
import java.util.*;
public class BiggestAndSecondBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int big = num;
        int secondBig = num;
        for (int i = 1; i < 10; i++) {
            System.out.print("enter a number: ");
            int n = sc.nextInt();
            if (n > big) {
                secondBig = big;
                big = n;    
            } else if (n > secondBig && n != big) {
                secondBig = n;
            }
        }
        System.out.println("Biggest number = " + big + " Second Biggest number = " + secondBig);
        sc.close();
    }
}
