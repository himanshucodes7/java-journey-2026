package Basic_Input_Output;
import java.util.*;
public class FahrenheitToCentigrade_14 {
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("enter the temperature in fahrenheit:");
    double f = sc.nextDouble();

    double c = (5/9.0) * (f - 32);
    System.out.println("Temperature in Centigrade = " + c);

    sc.close();
 }   
}
