import java.util.Random;

public class Benford {
	public static Random random = new Random();

	/* METHODES UTILTAIRES FOURNIES*/

	// affichage  d'un tableau d'entiers
	public static void print(int[] tab) {
		for (int i = 0; i < tab.length; ++i) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	// affichage  d'un tableau de doubles
	public static void print(double[] tab) {
		for (int i = 0; i < tab.length; ++i) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] frequencies = new int[9];
		double[] numbers = new double[500];

		//  TEST 1.1
		System.out.println("Test 1.1 : ");
		fillWithSquare(numbers);
//		fillRandom(numbers);
		print(numbers);
		System.out.println();
		// FIN TEST 1.1

		//TEST 1.2
		System.out.println("Test 1.2 : ");
		System.out.println(extractMaxDigit(0));
		System.out.println(extractMaxDigit(632));
		System.out.println(extractMaxDigit(-221));
		System.out.println(extractMaxDigit(-554.15));
		System.out.println(extractMaxDigit(0.00421));
		System.out.println();
		// FIN TEST 1.2

		//  TEST 1.3
		System.out.println("Test 1.3 : ");
		analyze(numbers, frequencies);
		print(frequencies);
		System.out.println();
		// FIN TEST 1.3

		// TEST 1.4
		System.out.println("Test 1.4 : ");
		testBenford(frequencies);
		// FIN TEST 1.4
	}

	private static void fillWithSquare(double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ((i + 1) * (i + 1)) / 100.0;
		}
	}

	private static void fillRandom(double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextDouble();
		}
	}

	private static int extractMaxDigit(double number) {
		if (number == 0)
			return 0;

		double result = number;

		while (result > 0 && result < 10)
			result = result * 10;

		do {
			result = Math.floor(Math.abs(result)) / 10;
		} while (result > 10.0);

		return (int) result;
	}

	private static void analyze(double[] numbers, int[] frequencies) {
		for (int i = 0; i < frequencies.length; i++) {
			int count = 0;

			for (double num : numbers) {
				if (extractMaxDigit(num) == i + 1)
					count += 1;
			}

			frequencies[i] = count;
		}
	}

	private static void testBenford(int[] frequencies) {
		int freqSum = 0;
		for (int f : frequencies) {
			freqSum += f;
		}

		System.out.println("Percentages:  real  /  predicted by Benford");
		for (int i = 0; i < frequencies.length; i++) {
			double real = ((double) 100 / freqSum) * frequencies[i];
			double benford = Math.log10(1 + ((double) 1 / (i + 1))) * 100;

			System.out.printf(
					"       '%d' : %.2f  /  %.2f\n", i, real, benford
			);
		}
	}
}

