package Basic_Input_Output;
import java.util.*;
public class ShirtPrice {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("enter the cost of one shirt: ");
    int shirtCost = sc.nextInt();
    
    System.out.println("enter the no of shirts to purchase: ");
    int N = sc.nextInt();

    int totalPrice = N * shirtCost;
    System.out.println("Total price of shirt = " + totalPrice);
    }
}
