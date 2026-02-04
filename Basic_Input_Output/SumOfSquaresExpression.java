package Basic_Input_Output;

public class SumOfSquaresExpression {
    public static void main(String[] args) {
        long sum1 = (30L*(30+1)*(2*30+1))/6 - (7L*8*(2*7+1))/6;

        long sum2 = (41L*(41+1)*(2*41+1))/6 - (26L*27*(2*26+1))/6;

        long sum3 = (100L*(100+1)*(2*100+1))/6 - (81L*82*(2*81+1))/6;

        long total = sum1 + sum2 + sum3;

        System.out.println("Total Sum = " + total);
    }
}
