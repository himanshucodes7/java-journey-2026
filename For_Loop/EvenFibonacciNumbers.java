package For_Loop;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        
        int a = 0, b = 1;
        System.out.println("Even Fibonacci numbers from 1 to 100: ");

        for(int i = 1; ; i++)
        {
            int c = a + b;

            if (c > 100) {
                break;
            }
            if (c % 2 == 0) {
                System.out.print(c + " ");
            }

            a = b;
            b = c;
        }
    }
}
