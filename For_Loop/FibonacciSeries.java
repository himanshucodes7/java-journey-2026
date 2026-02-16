package For_Loop;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        int n = 20;

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
