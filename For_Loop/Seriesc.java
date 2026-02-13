package For_Loop;

public class Seriesc {
    public static void main(String[] args) {
        int n = 3;
        double result;
        for(int i = 1; i <= 6; i++){
            result = n / Math.pow(10, i);
            System.out.print(result + " ");
        }
    }
}
