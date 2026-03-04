package Methods;
import java.util.*;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a, b, c;
        System.out.println("enter first number:");
        a = sc.nextInt();
        System.out.println("enter second number:");
        b = sc.nextInt();
        System.out.println("enter third number:");
        c = sc.nextInt();

        int smallest = smallestOf(a,b,c);
        int largest = largestOf(a,b,c);
        int middle = a + b + c - largest -smallest;
        System.out.print("Ascending order = " + smallest + " < " + middle + " < " + largest);
        sc.close();
    }

    public static int smallestOf (int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

    public static int largestOf (int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        } 
        if (c > largest) {
            largest = c;
        }
        return largest;
    }
}
