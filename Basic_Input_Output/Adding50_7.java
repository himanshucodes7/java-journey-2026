package Basic_Input_Output;
import java.util.*;
public class Adding50_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter a number:");
        int n = sc.nextInt();

        int result = n + 50;
        System.out.println("After adding 50 to a number = " + result);

        sc.close();
    }
}
