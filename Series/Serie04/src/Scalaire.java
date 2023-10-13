import java.util.Arrays;
import java.util.Scanner;

public class Scalaire {
    public static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        final int N_MAX = 10;

        int n;
        do {
            System.out.print("Enter the size of the vectors [1, 10]: ");
            n = bob.nextInt();
        } while (n < 1 || n > N_MAX);
        System.out.println();

        double[] v1 = new double[n];
        double[] v2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter entry #%d of v1 [double]: ", i);
            v1[i] = bob.nextDouble();
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            System.out.printf("Enter entry #%d of v2 [double]: ", j);
            v2[j] = bob.nextDouble();
        }

        double dotProduct = 0;
        for (int k = 0; k < n; k++) {
            dotProduct += v1[k] * v2[k];
        }

        System.out.printf(
            "The value of the dot product of \n   %s   and   %s\nis\n   %.3f",
                Arrays.toString(v1), Arrays.toString(v2), dotProduct
        );
    }
}
