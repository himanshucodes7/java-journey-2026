package String;
import java.util.*;
public class EachWordOnSeperateLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a sentence:");
        String s = sc.nextLine();

        String sum = "";
        for (int i = 0; i < s.length(); i++) {
             char x = s.charAt(i);

             if (x != ' ') {
                sum += x;
             } else {
                System.out.println(sum);
                sum = "";
             }
        }
        System.out.println(sum);
        sc.close();
    }
}
