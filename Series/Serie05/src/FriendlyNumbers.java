public class FriendlyNumbers {
    public static void main(String[] args) {
        int[] numbers = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};
        System.out.println("The pairs of friendly numbers are: ");
        friendlyNumbers(numbers);
    }

    private static void friendlyNumbers(int[] numbers) {
        int[] divSums = calculateDivSum(numbers);

        for (int i = 0; i < divSums.length; i++) {
            for (int j = i + 1; j < divSums.length; j++) {
                if(divSums[i] == divSums[j])
                    System.out.printf("(%d, %d) ",
                            numbers[i], numbers[j]);
            }
        }
        System.out.println();
    }

    private static int[] calculateDivSum(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int sum = 1;

            for (int j = 2; j <= numbers[i]; j++) {
                if ((numbers[i] % j) == 0)
                    sum += j;
            }
            result[i] = sum;
        }

        return result;
    }
}
