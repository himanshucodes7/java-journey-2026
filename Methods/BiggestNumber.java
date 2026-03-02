package Methods;
import java.util.*;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a, b, c;
        System.out.println("enter first number:");
        a = sc.nextInt();
        System.out.println("enter second number:");
        b = sc.nextInt();
        System.out.println("enter third number:");
        c =sc.nextInt();

        int big = biggestFinder(a, b, c);
        System.out.println("Biggest Number = " + big);

        sc.close();
    }   

    public static int biggestFinder(int a, int b, int c) {
        
        int big = a;
        if (b > big) {
            big = b;
        }
        if (c > big) {
            big = c;
        }
        return big;
    }
}
