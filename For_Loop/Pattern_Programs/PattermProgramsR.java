package For_Loop.Pattern_Programs;

public class PattermProgramsR {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++) {

            int num;

            // decide starting digit
            if(i % 2 == 0) {
                num = 1;
            } else {
                num = 0;
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(num);

                if(num == 0) {
                    num = 1;
                } else {
                    num = 0;
                }
            }

            System.out.println();
        }
    }
}
