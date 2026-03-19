package String;
import java.util.*;
public class IsUppercaseLowercaseMixedcaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string");
        String s = sc.nextLine();

        if (s.equals(s.toUpperCase())) {
            System.out.println("Uppercase String");
        } else if (s.equals(s.toLowerCase())) {
            System.out.println("Lowercase String");
        } else {
            System.out.println("Mixedcase String");
        }
        sc.close();
    }
}
