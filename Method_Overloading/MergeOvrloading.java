package Method_Overloading;

public class MergeOvrloading {
    public static void main(String[] args) {
        
        System.out.println(merge('a', 'b'));
        System.out.println(merge(12, 2345));
        System.out.println(merge("Very", "Good"));
    }
    public static String merge (char ch1, char ch2) {
        String result = "" + ch1 + ch2;
        return result;
    }

    public static String merge (int n1, int n2) {
        String result = "" + n1 + n2;
        return result;
    }
    public static String merge (String s1, String s2) {
        String result = s1.toUpperCase() + " " + s2.toUpperCase();
        return result;
    }
}
