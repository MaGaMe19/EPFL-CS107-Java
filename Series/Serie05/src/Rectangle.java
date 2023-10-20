import java.util.Scanner;

public class Rectangle {
    public static final Scanner bob = new Scanner(System.in);
    public static void main(String[] args) {
        double length = readInput("length");
        double height = readInput("height");

        boolean inputsOK = testInputs(length, height);

        if (inputsOK) {
            calculate(length, height);
        } else {
            error();
        }
    }

    private static double readInput(String text) {
        System.out.printf("Enter the %s: ", text);
        return bob.nextDouble();
    }

    private static boolean testInputs(double l, double h) {
        return (l > 0 && h > 0);
    }

    private static void calculate(double l, double h) {
        System.out.print("Surface are ('s') or Circumference ('c')? ");
        char choice = bob.next().toLowerCase().charAt(0);

        switch (choice) {
            case 's' -> System.out.printf("The surface area is: %.2f\n",
                    l * h);

            case 'c' -> System.out.printf("The circumference is: %.2f\n",
                    2 * l + 2 * h);

            default -> System.out.println("That was not an option.");
        }
    }

    private static void error() {
        System.out.println("Error: Length and / or height can't be negative!");
    }
}
