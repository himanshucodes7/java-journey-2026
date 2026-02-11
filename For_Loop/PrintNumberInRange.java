package For_Loop;
import java.util.*;
public class PrintNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number to where you want to start:");
        int start = sc.nextInt();
        System.out.println("enter a number to where you want to end the number printing:");
        int end = sc.nextInt();
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
