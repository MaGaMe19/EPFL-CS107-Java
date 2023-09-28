/* Ce programme permet d'adapter automatiquement, en fonction du nombre de convives, les quantités
d'ingrédients nécessaires à la confection d'une fondue fribourgeoise. ( ͡° ͜ʖ ͡°) */

import java.util.Scanner;

public class Fondue {
    public static void main(String[] args) {
        final int BASE = 4;

        double fromage = 800.0;
        double eau = 2.0;
        double ail = 2.0;
        double pain = 400.0;

        Scanner bob = new Scanner(System.in);
        System.out.print("Combien de personnes vont manger la fondue? ");
        int nbConvives = bob.nextInt();

        double fromageNouveau = fromage * nbConvives / BASE;
        double eauNouveau = eau * nbConvives / BASE;
        double ailNouveau = ail * nbConvives / BASE;
        double painNouveau = pain * nbConvives / BASE;

        System.out.printf("Pour faire une fondue fribourgeoise pour %d personnes, il te faut :\n", nbConvives);
        System.out.printf(" - %.1f gr de Vacherin fribourgeois,\n", fromageNouveau);
        System.out.printf(" - %.1f dl d'eau,\n", eauNouveau);
        System.out.printf(" - %.1f gousse(s) d'ail,\n", ailNouveau);
        System.out.printf(" - %.1f gr de pain,\n", painNouveau);
        System.out.println("et du poivre a volonte!");
    }
}