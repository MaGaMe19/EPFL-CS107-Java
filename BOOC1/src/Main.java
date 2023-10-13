import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "110";
        String s2 = "11"                 ;

        int v = Integer.parseInt(s2);

        for (int i = 0; i < s1.length(); i++){

            String subs1 = s1.substring(0, i + 1);
            String subs2 = s1.substring(i + 1, s1.length());

            if (i == s1.length() - 1){
                subs2 = "0";
            }

            int v1 = Integer.parseInt(subs1);
            int v2 = Integer.parseInt(subs2);

            if (v1 + v2 == v){
                System.out.println(subs1 + " + " + subs2 + " = " + s2 );
            }
        }
    }
}
