package For_Loop;
import java.util.*;
public class SmallesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int small = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.print("enter a number = ");
            int n = sc.nextInt();
            if (n <= small) {
                small = n;
            }
        }
        System.out.print("Smallest number = " + small);
        sc.close();
    }
}
