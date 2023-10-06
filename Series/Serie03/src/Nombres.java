import java.util.Scanner;

public class Nombres {
    private static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Give Bob a number [int]: ");
        int num = bob.nextInt();

        System.out.printf("The number is %s and %s.",
                num > 0 ? "positive" : (num < 0 ? "negative" : "zero"),
                num % 2 == 0 ? "even" : "odd"
        );
    }
}
