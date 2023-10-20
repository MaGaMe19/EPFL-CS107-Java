public class Main {
    private static int extractMaxDigit(double d) {
        if (d == 0)
            return 0;

        double result = d;

        while (result > 0 && result < 10)
            result = result * 10;

        do {
            result = Math.floor(Math.abs(result)) / 10;
        } while (result > 10.0);

        return (int) result;
    }
    public static void main(String[] args) {
        System.out.println(extractMaxDigit(0));
        System.out.println(extractMaxDigit(632));
        System.out.println(extractMaxDigit(-221));
        System.out.println(extractMaxDigit(-554.15));
        System.out.println(extractMaxDigit(0.00421));
    }
}