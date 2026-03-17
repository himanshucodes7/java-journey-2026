package Basic_Input_Output;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int a = sc.nextInt();
        System.out.println("enter a number:");
        int b = sc.nextInt();

        int c = a * b;
        System.out.println(c);
        sc.close();
    }
}
