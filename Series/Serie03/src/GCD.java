import java.util.Scanner;

public class GCD {
    private static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a [int, a > 0]: ");
        int a = bob.nextInt();

        System.out.print("Enter b [int, b > 0]: ");
        int b = bob.nextInt();

        System.out.printf("The greatest common divisor of %d and %d is: %d.",
                a, b, euclid(a, b));
    }

    private static int euclid(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return euclid(a - b, b);
        } else {
            return euclid(a, b - a);
        }
    }
}
