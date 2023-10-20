import java.util.Scanner;

class Hyphenation {
	public static final Scanner bob = new Scanner(System.in);

	public static void main(String[] args) {
		String[] sentence;
		do {
			sentence = readSentence();

			for (String word : sentence) {
				hyphenation(word);
			}

			System.out.println();
		} while (!sentence[0].equals("*"));
	}

	static String[] readSentence() {
		System.out.print("Enter your sentence: ");
		String sentence = bob.nextLine();
		return sentence.split(" ");
	}

	static boolean vowel(char c) {
		String vowels = "aeiou";
		return (vowels.indexOf(c) != -1);
	}

	static boolean onlyVowels(String s) {
		for (char c : s.toCharArray()) {
			if (!vowel(c)) {
				return false;
			}
		}
		return true;
	}

	static void hyphenation(String word) {

		boolean abandon = onlyVowels(word) || word.length() < 4;
		if (abandon)
			System.out.println(word);

		else {
			for (int i = 1; i < word.length(); i++) {
				if (vowel(word.charAt(i))) {

					if (word.substring(i + 1).length() < 2) {
						System.out.println(word);
						continue;
					}

					if (vowel(word.charAt(i + 1))) {
						continue;
					}

					System.out.printf("%s-\n%s\n",
							word.substring(0, i+1),
							word.substring(i+1)
					);
					break;
				}
			}
		}
	}
}
