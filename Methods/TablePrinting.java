package Methods;
import java.util.*;
public class TablePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a value of N :");
        int N = sc .nextInt();
        System.out.println("enter the value of Z upto where u want to print table:");
        int Z = sc.nextInt();
        tablePrintOf(N,Z);
        sc.close();
    }
    public static void tablePrintOf (int N, int Z)
    {
        for (int i = 1; i <= Z; i++)
        {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}
