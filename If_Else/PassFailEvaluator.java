package If_Else;
import java.util.*;
public class PassFailEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter total marks out of 100: ");
        int marks = sc.nextInt();

        if (marks > 39) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
