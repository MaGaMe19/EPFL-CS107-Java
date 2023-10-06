import java.util.Scanner;

public class Rebound2 {
    public static final double G = 9.81;
    public static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the initial height H0  [double, H0 >= 0]: ");
        double h0 = bob.nextDouble();

        System.out.print("Enter the coefficient of rebound eps  [double, 0 <= eps < 1]: ");
        double eps = bob.nextDouble();

        System.out.print("Enter the desired final height hFin [double, 0 < hFin < H0]: ");
        double hFin = bob.nextDouble();

        double currentHeight = h0;
        int bounces = 0;
        do {
            currentHeight = bounce(currentHeight, eps);
            bounces++;
        } while (currentHeight > hFin);

        System.out.printf("The amount of bounces to reach the height %f is: %d",
                hFin, bounces);
    }

    public static double bounce(double height, double eps) {
        double velocityImpact = Math.sqrt(2 * height * G);
        double newVelocity = velocityImpact * eps;
        return (newVelocity * newVelocity) / (2 * G); // new height
    }
}
