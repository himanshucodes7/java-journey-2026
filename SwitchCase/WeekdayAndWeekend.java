package SwitchCase;
import java.util.*;
public class WeekdayAndWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:(1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;                     
            default: 
                System.out.println("Wrong day");
        }
        sc.close();
    }
}
