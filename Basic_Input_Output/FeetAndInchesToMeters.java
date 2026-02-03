package Basic_Input_Output;
import java.util.*;
public class FeetAndInchesToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the length in feet:");
        double feet = sc.nextDouble();

        System.out.println("enter the length in inches:");
        double inches = sc.nextDouble();

        double totalInches = (feet * 12) + inches;
        double inchesToCenti = totalInches * 2.54;
        double centiToMeters = inchesToCenti / 100;

        System.out.println("Equivalent length in meters = " + centiToMeters);

        sc.close();
    }
}
