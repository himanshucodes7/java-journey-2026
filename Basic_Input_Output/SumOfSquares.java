package Basic_Input_Output;

public class SumOfSquares {
    public static void main(String args[])
    {
        long n1 = 100;
        long n2 = 7;

        long sum100 = (n1 * (n1 + 1) * (2 *n1 + 1)) / 6;
        long sum7 = (n2 * (n2 + 1) * (2 * n2 + 1)) / 6;

        long result = sum100 - sum7;
        System.out.println("Sum from 8^2 to 100^2 = " + result);
    }    
}
