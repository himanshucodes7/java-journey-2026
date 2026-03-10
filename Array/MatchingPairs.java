package Array;

public class MatchingPairs {
    public static void main(String[] args) {
        int sum = 8;
        int a[] = {3, 5, 1, 6, 2, 7, 9};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] + a[j] == sum) {
                    System.out.println(a[i] + " + " + a[j] + " = " + sum);
                }
            }
        }
    }
}
