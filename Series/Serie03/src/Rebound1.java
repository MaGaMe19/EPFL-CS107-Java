import java.util.Scanner;

public class Rebound1 {
    public static final double G = 9.81;
    public static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the initial height H0  [double, H0 >= 0]: ");
        double h0 = bob.nextDouble();

        System.out.print("Enter the coefficient of rebound eps  [double, 0 <= eps < 1]: ");
        double eps = bob.nextDouble();

        System.out.print("Enter the number of rebounds NBR  [int, NBR >= 0]: ");
        int NBR = bob.nextInt();

        double currentHeight = h0;
        for (int i = 0; i < NBR; i++) {
            currentHeight = bounce(currentHeight, eps);
        }

        System.out.printf("The final height after %d bounces is: %.3f",
                NBR, currentHeight);
    }

    public static double bounce(double height, double eps) {
        double velocityImpact = Math.sqrt(2 * height * G);
        double newVelocity = velocityImpact * eps;
        return (newVelocity * newVelocity) / (2 * G); // new height
    }
}
