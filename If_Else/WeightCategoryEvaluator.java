package If_Else;
import java.util.*;
public class WeightCategoryEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the weight: ");
        double weight = sc.nextDouble();

        if (weight > 100) {
            System.out.println("Overweight");
        } else if (weight >= 50) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Underweight");
        }
        sc.close();
    }
}
