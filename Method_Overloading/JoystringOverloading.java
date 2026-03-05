package Method_Overloading;

public class JoystringOverloading {
    public static void main(String[] args) {
        
        joyString ("TECHNALAGY", 'A', 'O');
        joyString ("Cloud computing means Internet based computing");
        joystring ("COMMON WEALTH", "GAMES");
    }

    public static void joyString (String s, char ch1, char ch2) {
        String result = s.replace(ch1, ch2);
        System.out.println(result);
    }

    public static void joyString (String s) {
        int first = s.indexOf(' ');
        int last = s.lastIndexOf(' ');
        System.out.println("First space position = " + first);
        System.out.println("Last space position = " + last);
    }

    public static void joystring (String s1, String s2)
    {
        String result = s1 + " " + s2;
        System.out.println(result);
    }
}
