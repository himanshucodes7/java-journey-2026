package For_Loop;
import java.util.*;
public class MarksFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double marksPercent;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;

        System.out.println("enter percentage marks of 20 students in computer studies");

        for(int i = 1; i <= 20; i++){
            marksPercent = sc.nextDouble();

            if (0 <= marksPercent && marksPercent <= 34) {
                c1++;
            } else if (marksPercent <= 59) {
                c2++;
            } else if (marksPercent <= 79) {
                c3++;
            } else {
                c4++;
            }
        }
        System.out.println("Frequency table for the %marks of 20 students in computer studies are:");
        System.out.println("Category    " + " Marks(%) " + " Frequency ");
        System.out.println("Fail        " + " 0 - 34      " + c1);
        System.out.println("Fail        " + " 35 - 59     " + c2);
        System.out.println("Fail        " + " 60 - 79     " + c3);
        System.out.println("Fail        " + " Above 80    " + c4);
        
        sc.close();
    }
}
