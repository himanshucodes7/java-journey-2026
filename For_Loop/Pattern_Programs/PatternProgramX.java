package For_Loop.Pattern_Programs;

public class PatternProgramX {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                sum += j;
            }
            System.out.println(sum);
        }
    }
}
