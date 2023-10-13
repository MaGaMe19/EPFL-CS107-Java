public class Primes {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 2 and 100:");

        for (int i = 1; i < 100; i++) {
            if (((i % 2 != 0) && i != 1) || i == 2) {
                boolean done = false;
                for (int j = 2; j < Math.sqrt(i) && !done; j++) {
                    if (i % j == 0)
                        done = true;
                }

                if (!done)
                    System.out.println(i);
            }
        }
    }
}
