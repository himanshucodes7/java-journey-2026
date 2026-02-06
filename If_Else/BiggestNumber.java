package If_Else;
import java.util.*;
public class BiggestNumber {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n1, n2, n3;

        System.out.println("enter first number:");
        n1 = sc.nextInt();
        System.out.println("enter second number:");
        n2 = sc.nextInt();
        System.out.println("enter third number:");
        n3 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Biggest number = " + n1);
        } else if (n2 > n3) {
            System.out.println("Biggest number = " + n2);
        } else {
            System.out.println("Biggest number = " + n3);
        }
        sc.close();
    }
}
