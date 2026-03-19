package String;
import java.util.*;
public class InitialsOfName {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a name:");
        String s = sc.nextLine() + " ";

        String z = "", k = "";

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x != ' ') {
                z += x;
            } else {
                k = k + z.charAt(0) + ".";
                z = "";
            }
        }
        System.out.println("Initials is " + k);
        sc.close();
    }
}
