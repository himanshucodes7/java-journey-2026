package Array;

public class SmallestNumber {
    public static void main (String args[])
    {
        int numbers[] = {2, 3, 6, 8, 4};
        System.out.println("Smallest number = " + getSmallest(numbers));
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
