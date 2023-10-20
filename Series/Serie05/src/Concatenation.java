public class Concatenation {
    public static void main(String[] args) {
        String s = "China Blue";
        System.out.println(s);
        s = concatenate(s, " Express");
        System.out.println(s);
    }

    private static String concatenate(String s, String s1) {
        return s += s1;
    }
}
