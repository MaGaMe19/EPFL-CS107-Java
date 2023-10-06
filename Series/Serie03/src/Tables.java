public class Tables {
    public static void main(String[] args) {
        System.out.println("--- Multiplication Tables ---");
        for (int i = 2; i <= 10; i++) {
            System.out.printf("Table for %d:\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf(" %d * %d = %d\n",
                        j, i, j * i);
            }
            System.out.println();
        }
    }
}
