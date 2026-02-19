package For_Loop;

public class Series49 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {


            if (i == 1) {
                System.out.print(i);
            }
            else if (i % 2 == 0) {
                System.out.print(" - " + i);;
            } else {
                System.out.print(" + " + i);
            }
        }
    }
}
