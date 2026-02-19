package For_Loop;

public class Series50 {

    public static void main(String[] args) {
        int term = 1;

        for (int i = 2; i <= 40; i += 2) {

            if (term == 1) {
                System.out.print(i);
            }
            else if (term % 2 == 0) {
                System.out.print("-" + i);
            }
            else {
                System.out.print("+" + i);
            }

            term++;
        }
    }
}
