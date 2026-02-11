package For_Loop;
import java.util.*;
public class SumOfNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter starting point: ");
        int start = sc.nextInt();
        System.out.print("enter ending point: ");
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
