import java.util.ArrayList;
import java.util.Scanner;

public class Pascal {
    public static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print(
                    "Enter the size of the Pascal Triangle [n >= 1]: ");
            n = bob.nextInt();
        } while (n < 1);

        ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Long> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || i == j )
                    list.add((long) 1);
                else
                    list.add(pascalTriangle.get(i - 1).get(j - 1) +
                    pascalTriangle.get(i - 1).get(j));
            }
            pascalTriangle.add(list);
        }

        for (ArrayList<Long> list :
                pascalTriangle) {
            System.out.println(list);
        }
    }
}
