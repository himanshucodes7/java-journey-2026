package Methods;
import java.util.*;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter three Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = smallestFinder(a, b, c);
        System.out.print("smallest number = " + result);

        sc.close();
    }

    public static int smallestFinder(int a, int b, int c) {
        int small = a;
        if (b < small) {
            small = b;
        }
        if (c < small) {
            small = c;
        }
        return small;
    }
}
