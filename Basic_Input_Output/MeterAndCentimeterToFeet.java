package Basic_Input_Output;
import java.util.*;
public class MeterAndCentimeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the length in meters:");
        double meter = sc.nextDouble();

        System.out.println("enter the length in centimeter:");
        double centimeter = sc.nextDouble();

        double totalCentimeter = (meter * 100) + centimeter;
        double centiToFeet = ((totalCentimeter / 2.54)) / 12;

        System.out.println("The equivalent length in feet = " + centiToFeet);

        sc.close();
    }
}
