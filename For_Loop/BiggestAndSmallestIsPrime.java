package For_Loop;
import java.util.*;
public class BiggestAndSmallestIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();
        int big = n;
        int small = n;

        for(int i = 1; i < 10; i++) {
            System.out.println("enter a number:");
            int num = sc.nextInt();
            
            if (num > big) {
                big = num;
            }
            if (num < small) {
                small = num;
            }
        }
        int bigCount = 0;
        for(int i = 1; i <= big; i++) {
            if(big % i == 0)
                bigCount++;
        }

        int smallCount = 0;
        for(int i = 1; i <= small; i++){
            if (small % i == 0) {
                smallCount++;
            }
        }

        if (bigCount == 2) {
            System.out.println("Biggest Number is Prime");
        }else {
            System.out.println("Biggest number is not prime");
        }
        if (smallCount == 2) { 
            System.out.println("Smallest Number is Prime");
        } else {
            System.out.println("smallest number is not prime");
        }
        sc.close();
    }
}
