package For_Loop;

public class FactorialOfEvenNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 20; i += 2) {   // direct even numbers
            long f = 1;

            for (int j = 1; j <= i; j++) {
                f *= j;
            }

            System.out.println("Factorial of " + i + " = " + f);
        }
    }
}