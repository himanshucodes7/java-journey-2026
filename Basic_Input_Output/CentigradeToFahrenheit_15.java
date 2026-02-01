package Basic_Input_Output;
import java.util.*;
public class CentigradeToFahrenheit_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Input temperature in centigrade:");
        double c = sc.nextDouble();

        double f = ((9/5.0) * c) + 32;
        System.out.println("Temperature in Fahrenheit = " + f);

        sc.close();
    }
}
