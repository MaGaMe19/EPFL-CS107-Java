import java.util.Random;

public class Week6 {
    private static Random random = new Random();

    public static int getFirstElement(int[] a) {
        return a[0];
    }

    public static void checkVibes() throws VibeException {
        if (random.nextBoolean())
            System.out.println("Vibin'");
        else
            throw new VibeException();
    }

    public static void main(String[] args) {
        try {
            checkVibes();

            int result = getFirstElement(new int[]{4, 5, 6});
            System.out.println(result);

            int[] array = new int[]{};
            result = getFirstElement(array);
            System.out.println(result);

        } catch (VibeException e) {
            System.out.println(e.getMessage());
            System.out.println("Try vibing more");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finished!");
        }
    }
}