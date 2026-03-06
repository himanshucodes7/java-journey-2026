package Array;
import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a [] = new int [10];
        int i, s = 0;
        for (i = 0; i <= 9; i++) {
            System.out.println("enter a number");
            a[i] = sc.nextInt();
            s = s + a[i];
        }
        System.out.println("Sum of numbers = " + s);
        sc.close();
    }
}