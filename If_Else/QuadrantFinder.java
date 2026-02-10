package If_Else;
import java.util.*;
public class QuadrantFinder {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter x coordinates: ");
            int x = sc.nextInt();
            System.out.println("Enter y coordinates: ");
            int y = sc.nextInt();

            if (x == 0 && y == 0) {
                System.out.println("Point lies on origin.");
            } else if (x == 0) {
                System.out.println("Point lies on y axis.");
            } else if (y == 0) {
                System.out.println("Point lies on x axis.");
            } else if (x > 0 && y > 0) {
                System.out.println("Point lies in first quadrant.");
            } else if (x < 0 && y > 0) {
                System.out.println("Point lies on first quadrant.");
            } else if (x < 0 && y < 0) {
                System.out.println("Point lies on third quadrant.");
            } else {
                System.out.println("Point lies on fourth quadrant.");
            }
        }
    }
}
