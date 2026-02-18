package For_Loop;

public class FourDigitNumber {
    
    public static void main(String[] args) {
        
        for(int num = 1000; num <= 9999; num++){
            int first = num / 1000;
            int second = (num / 100) % 10;
            int third = (num / 10) % 10;
            int fourth = num % 10;

            if (first % 2 == 0 && second % 2 == 0 && third % 2 != 0 && fourth % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
