package For_Loop;
import java.util.*;
public class BiggestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int num = sc.nextInt();
        int big = num;
        int small = num;
        int total = 10;
        for(int i = 1; i < total; i++)
        {
            System.out.print("enter a number: ");
            int n = sc.nextInt();
            if (n > big) {
                big = n;
            }
            if (n < small) {
                small = n;
            }
        }
        System.out.println("Biggest = " + big + " Smallest = " + small);
        sc.close();
    }
}
