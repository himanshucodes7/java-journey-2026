package For_Loop;
import java.util.*;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int big = sc.nextInt();
        for(int i = 1; i <= 9; i++) {
            System.out.print("enter a number = ");
            int n = sc.nextInt();
            if (n >= big) {
                big = n;
            }
        }
        System.out.print("Biggest Of numbers = " + big);
        sc.close();
    }
}
