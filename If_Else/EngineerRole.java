package If_Else;
import java.util.*;
public class EngineerRole {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter how many years of experience you have?");
        int exp = sc.nextInt();

        if (exp <= 2) {
            System.out.println("Associate Engineer");
        } else if (exp <= 5) {
            System.out.println("Software Engineer");
        } else if (exp <= 7) {
            System.out.println("Sr. Software Engineer");
        } else {
            System.out.println("Manager");
        }

        sc.close();
    }
}
