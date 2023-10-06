import java.util.Scanner;

public class Bilan {
    private static final Scanner bob = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Give Bob the number of months [int]: ");
        int n = bob.nextInt();

        int min = 0;
        int max = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Amount of money you received in month %d [int]: ",
                    i);
            int amount = bob.nextInt();

            if (amount < min || i == 1) {
                min = amount;
            }
            if (amount > max || i == 1) {
                max = amount;
            }
            sum += amount;
        }

        System.out.println("\n---\n");

        System.out.printf("Average monthly amount:  %d\n", sum / n);
        System.out.printf("Smallest monthly amount: %d\n", min);
        System.out.printf("Largest monthly amount:  %d\n", max);
    }
}
