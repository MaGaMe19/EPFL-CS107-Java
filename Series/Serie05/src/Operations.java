public class Operations {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};

        operations(arr);
        remplir1();
        remplir2();
        remplir3();
    }

    private static void remplir3() {
        int[] arr = new int[5];
        for (int i = arr.length; i > 0; i--) {
            arr[i-1] = i;
        }
        operations(arr);
    }

    private static void remplir2() {
        int[] arr = new int[10];
        for (int i = 5; i < arr.length + 5; i++) {
            arr[i-5] = i;
        }
        operations(arr);
    }

    private static void remplir1() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        operations(arr);
    }

    private static void operations(int[] arr) {
        afficher(arr);
        operation1(arr);
        operation2(arr);
        operation3(arr);
        operation4(arr);
        operation5(arr);
        System.out.println();
    }

    private static void operation5(int[] arr) {
        int max = 0;
        for (int e : arr) {
            max = Math.max(max, e);
        }
        System.out.printf("The maximal value is: %d\n", max);
    }

    private static void operation4(int[] arr) {
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        double mean = (double) sum / arr.length;
        System.out.printf("The arithmetic mean of all elements in the array is: %.2f\n", mean);
    }

    private static void operation3(int[] arr) {
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.printf("The sum of all elements in the array is: %d\n", sum);
    }

    private static void operation2(int[] arr) {
        int count = 0;
        for (int e : arr) {
            if (e > 4 || e < 2) count += 1;
        }
        System.out.printf("There are %d elements whose value is more than 4 or less than 2.\n", count);
    }

    private static void operation1(int[] arr) {
        int count = 0;
        for (int e : arr) {
            if (e == 9) count += 1;
        }
        System.out.printf("There are %d elements with the value 9.\n", count);
    }

    private static void afficher(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
