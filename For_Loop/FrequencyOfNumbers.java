package For_Loop;
import java.util.*;
public class FrequencyOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        System.out.println("enter 20 numbers:");
        
        for(int i =1; i <= 20; i++){
            num = sc.nextInt();

            if (0 <= num && num <= 25) {
                c1++;
            } else if (num <= 50) {
                c2++;
            } else if (num <=75) {
                c3++;
            } else {
                c4++;
            }
        }
        System.out.println("Class Interval            Frequency");
        System.out.println("   0 - 25                   " + c1 );
        System.out.println("   26 - 50                  " + c2 );
        System.out.println("   51 - 75                  " + c3 );
        System.out.println("   Above 75                 " + c4 );
        sc.close();
    }
}
