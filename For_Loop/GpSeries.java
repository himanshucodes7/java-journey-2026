package For_Loop;
import java.util.*;
public class GpSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the last term:");
        int terms = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= terms; i++)
        {
            System.out.print(num + " ");
            num = num * 2;
        }
        sc.close();
    }
}
