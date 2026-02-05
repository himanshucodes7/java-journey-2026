package If_Else;
import java.util.*;
public class BiggestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number:");
        int n1 = sc.nextInt();
        System.out.println("enter second number:");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Biggest number = " + n1);
        } else {
            System.out.println("Biggest number = " + n2);
        }

        sc.close();
    }
}
