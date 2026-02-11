package For_Loop;
import java.util.*;
public class PrintTableUnderLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number whose table you want to print: ");
        int n = sc.nextInt();
        System.out.println("enter a number upto where you want to print table: ");
        int z = sc.nextInt();
        for(int i = 1; i <= z; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}
