import java.util.Scanner;

public class Palindrome {
    public static final Scanner bob = new Scanner(System.in);

    public static void main(String[] args) {
        String wordOri;
        do {
            System.out.print("Enter a word: ");
            wordOri = bob.nextLine();

            String word = wordOri.replace(" ", "").toLowerCase();

            boolean isPalindrome = palindrome(word);

            System.out.printf("'%s' %s a palindrome!\n", wordOri,
                    isPalindrome ? "is" : "is not");
            System.out.println();
        } while (!wordOri.equals("*"));
    }

    public static boolean palindrome(String word) {
        boolean result = false;
        if (word.length() < 2)
            result = true;
        else if (word.charAt(0) == word.charAt(word.length() - 1))
            result = palindrome(word.substring(1, word.length() - 1));

        return result;
    }
}
