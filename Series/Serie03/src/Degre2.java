import java.util.Scanner;

public class Degre2 {
    private static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        double a = 0.0;
        double b, c;

        while (a == 0.0) {
            System.out.print("Enter a non-zero value for a: ");
            a = bob.nextDouble();
        }

        System.out.print("Enter a value for b: ");
        b = bob.nextDouble();

        System.out.print("Enter a value for c: ");
        c = bob.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("There are no real solutions.");
        } else if (delta > 0) {
            System.out.printf("There are two solutions: \n  %.3f\n  %.3f",
                    (-b + Math.sqrt(delta)) / (2 * a),
                    (-b - Math.sqrt(delta)) / (2 * a)
            );
        }
    }
}
