package Basic_Input_Output;

public class Increment {
    public static void main(String[] args) {
        
        int a = 8;
        int b = a++ + ++a + --a + ++a;
        System.out.println(b);
    }
}
