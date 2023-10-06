import java.util.Scanner;

public class Intervalle {
    private static final Scanner bob = new Scanner(System.in);
    public static void main(String[] args) {
        double x = 0;
        while (x != 5) {
            System.out.print("Give Bob a number [double]: ");
            x = bob.nextDouble();

            // I = [-10,-2]   U   ]0,1]   U   [2,3[
            System.out.println(
                    (!(x < -10) && !(x > -2)) || ((x > 0) && !(x > 1)) || (!(x < 2) && (x < 3))
                    ? String.format("%.3f is included in I!\n", x)
                    : String.format("%.3f is not included in I!\n", x)
            );
        }
    }
}
