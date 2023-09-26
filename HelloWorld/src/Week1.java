import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        // ========================================================= variables
        // déclaration:
        int x = 1;  // type identificateur = valeurInitiale ;

        double y;   // variable non initialisée
        y = 5.915;  // donner une valeur à une variable : l'affectation (= assignment)

        // types élémentaires : int, double, char

        // "final" désigne une constante
        final char z = 'a';


        // ========================================================= lecture / écriture ( ͡° ͜ʖ ͡°)
        // affichage à l'écran (= print to screen)
        System.out.println("Hello World!");

        // ou
        System.out.println(
            "Les variables x, y, z contiennent: " + String.format("%d, %f, %c.\n", x, y, z)
        );

        // lecture au clavier (= input)
        Scanner bob = new Scanner(System.in);
        System.out.print("Quel est ton nom? ");

        String nom = bob.nextLine();    // lire tous les caractères tapés jusqu'à return
        System.out.printf("Bonjour %s, moi c'est Bob", nom);
    }
}