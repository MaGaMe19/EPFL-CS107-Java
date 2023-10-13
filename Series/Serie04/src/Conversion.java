import java.util.Scanner;

public class Conversion {
    public static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        char c;
        do {
            System.out.print("Enter a single character a..z or A..Z: ");
            c = bob.next().charAt(0);
            int code = c;

            if (code < 65 || (code > 90 && code < 97) || code > 122) {
                System.out.println("Character is not valid.");
            } else {
                if (code <= 90) {
                    System.out.printf("Lowercase version: %c\n",
                            (char) code + 32);
                } else {
                    System.out.printf("Uppercase version: %c\n",
                            (char) code - 32);
                }
            }
            System.out.println();
        } while (c != '.');
    }
}