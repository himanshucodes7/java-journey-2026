package For_Loop;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        
        for(int num = 100; num <= 999; num++){
            
            int first = num / 100;
            int second = (num / 10) % 10;
            int third = num % 10;

            if (first % 2 != 0 && second % 5 == 0 && third % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
