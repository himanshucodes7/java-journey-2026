package For_Loop;
import java.util.*;
public class PrintTableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number to which you want to print table: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}
