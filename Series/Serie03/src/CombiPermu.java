public class CombiPermu {

	public static void main(String[] args) {
		/* Formule mathématique calculant le nombre de  permutations de k
		 * élements parmis n : (n!)/(n-k)!
		 * Formule mathématique calculant le nombre de combinaisons de k
		 * élements parmis n : (n!)/(k!*(n-k)!)
		 */
		//valeurs à définir
		int n = 10;
		int k = 6;

		System.out.printf("Number of permutations of 6 of 10 elements: %d\n",
				factorial(n) / factorial(n - k));

		System.out.printf("Number of combinations of 6 of 10 elements: %d\n",
				factorial(n) / (factorial(k) * factorial(n - k)));
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
