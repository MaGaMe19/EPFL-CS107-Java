import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {
        // Chapitre 8 : itérations (1)
        // ================================================ boucle for (for-loop)
        for (int i = 0; i < 5; i++) {
            System.out.printf("Le carre de %d vaut %d\n", i, i * i);
        }
        System.out.println();

        // Chapitre 9 : itérations (2)
        // ================================================ boucles for imbriquées
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("i = %d, j = %d, i*j = %d\n", i, j, i * j);
            }
        }
        System.out.println();

        // Chapitre 11 : boucles conditionnelles
        // ================================================ boucle do...while
        /* Une boucle do...while permet de répéter le corps de la boucle tant qu'une
        condition est respectée tout en garantissant que le corps sera exécuté au
        moins une fois. */
        Scanner bob = new Scanner(System.in);
        int nombreDeNotes;
        do {
            System.out.print("Entre un nombre supérieur à 0 [int]: ");
            nombreDeNotes = bob.nextInt();
        } while (nombreDeNotes <= 0);

        // ================================================ boucle while
        /* Le principe est similaire à celui de la boucle do...while à la difference
        que la condition est testée avant d'entrer dans la boucle. Si la condition
        est fausse, les instructions dans la boucle ne sont donc pas exécutées. */

        // Chapitre 12 : blocs d'instruction
        // ================================================ blocs
        // - portée d'une variable == scope of a variable
    }
}
