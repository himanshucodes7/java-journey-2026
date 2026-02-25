package While_Loop;
import java.util.Scanner;
public class TablePrintingUptoUserDesired {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    char choice = 'y';
    while (choice == 'y' || choice == 'Y') {
        System.out.println("enter a num:");
        int num = sc.nextInt();

        System.out.println("Table of " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.print("Do you want to continue? (y/n): ");
        choice = sc.next().charAt(0);
    }
    System.out.println("Program ended.");
    sc.close();
   } 
}
