package Array;

public class ReverseArray {
    public static void main (String args[]) {
        int numbers[] = {4, 8, 3, 12, 7, 5, 6, 14};
        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int numbers[]) {

        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }
}
