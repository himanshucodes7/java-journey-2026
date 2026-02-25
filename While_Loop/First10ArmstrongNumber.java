package While_Loop;

public class First10ArmstrongNumber {
public static void main(String[] args) {
    int num = 1;
        int count = 0;

        while (count < 10) {

            int temp = num;
            int digits = 0;

            // count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            // power sum
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                for (int i = 1; i <= digits; i++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
}    
}
