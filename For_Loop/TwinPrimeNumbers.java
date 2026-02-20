package For_Loop;

public class TwinPrimeNumbers {
    public static void main(String[] args) {
        
        for(int i = 2; i <= 100; i++)
        {
            int count1 = 0;
            int count2 = 0;

            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count1++;
                }
            }

            for (int j = 1; j <= i+2; j++){
                if ((i+2) % j == 0) {
                    count2++;
                }
            }

            if (count1 == 2 && count2 == 2 && (i+2) <= 100) {
                System.out.println(i + " and " + (i+2));
            }
        }
    }
}
