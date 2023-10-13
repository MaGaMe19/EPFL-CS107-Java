public class Codes {
    public static void main(String[] args) {
        char[] chars = {'*', '9', 'W'};
        for (char c: chars){
            System.out.printf("Unicode of '%c': %d\n", c,  (int) c);
        }

        int[] codes = {34, 65, 123};
        for (int code : codes) {
            System.out.printf("Character for Unicode %d: %c\n",
                    code, (char) code);
        }
    }
}
