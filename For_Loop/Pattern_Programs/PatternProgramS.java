package For_Loop.Pattern_Programs;

public class PatternProgramS {
    
    public static void main(String[] args) {
        int num = 1;
    for(int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++) {

            System.out.print(num);
            num++;
            if (num > 3) {
                num = 1;
            }
        }
        System.out.println();
    }
    }
}
