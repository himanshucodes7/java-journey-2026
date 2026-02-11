package For_Loop;
import java.util.*;
public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number from where you want to print even number: ");
        int start = sc.nextInt();
        System.out.println("enter a number to where you want to end printing even number: ");
        int end = sc.nextInt();
        for(int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
