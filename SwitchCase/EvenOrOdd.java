package SwitchCase;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter a number:");
        int a = sc.nextInt();

        switch (a % 2) {
            case 0: System.out.println("Even Number");
                break;
        
            case 1: System.out.println("Odd Number");
        }
        sc.close();
    }
}
