/* Une tante fortunée vous envoie un jour une petite enveloppe (en francs tout ronds) pour vos études
à l'EPFL. L'étudiant prévoyant et organisé que vous êtes décidé de gérer cette somme de la façon suivante :

 - Les trois quarts de cette somme seront dédiés à l'achat de livres et fournitures
 - Le reste sera équitablement réparti entre les rubriques "cafés à Sat", "abonnement au Flash" et "billets de
   métro".

Vous décidez également de gérer cette somme en francs tout rond. Le reste de l'argent sera destiné à acheter un
bouquet de fleur à votre maman pour la prochaine fête des mères. Supposant qu'un café à Sat vaut 2 Frs,
qu'un numéro du Flash en vaut 4 et qu'un billet de métro vaut 3 Frs.

Ce programme va calculer combien cafés à Sat, combien numéros de Flash et combien billets de métro on peut
acheter (si on dépense la même quantité d'argent pour toutes les catégories) et combien d'argent reste pour
acheter des fleurs.
 */

import java.util.Scanner;

public class Roses {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);

        System.out.print("Combien avez-vous recu d'argent (Frs)? ");
        int argentTotal = bob.nextInt();

        int argentLivres = 3 * argentTotal / 4;
        System.out.printf("Livres et Fournitures: %d Frs\n", argentLivres);

        int argentADepenser = argentTotal - argentLivres;

        int nbCafes = argentADepenser / 3 / 2;
        int nbFlash = argentADepenser / 3 / 4;
        int nbMetro = argentADepenser / 3 / 3;

        // calculer l'argent pour les roses -> le reste de : argent_a_dépenser / argent_deja_dépensé
        int argentRoses = argentADepenser % (nbCafes * 2 + nbFlash * 4 + nbMetro * 3);

        System.out.println("Vous pouvez ensuite acheter :");
        System.out.printf(" - %d cafes a Sat\n", nbCafes);
        System.out.printf(" - %d numeros du Flash\n", nbFlash);
        System.out.printf(" - %d billets de metro\n", nbMetro);
        System.out.printf("et il vous restera encore %d Frs pour des roses.", argentRoses);

    }
}
