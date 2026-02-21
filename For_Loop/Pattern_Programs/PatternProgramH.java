package For_Loop.Pattern_Programs;

public class PatternProgramH {
    public static void main(String[] args) {
        
        int a = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
