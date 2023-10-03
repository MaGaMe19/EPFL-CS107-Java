import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        // check if entered hours are in the correct format (between 0 and 24), not equal, and end hour is not smaller than start hour
        if (debut < 0 || debut > 24 || fin < 0 || fin > 24) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");

        } else if (debut == fin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");

        } else if (fin < debut) {
            System.out.println("Bizarre, le début de la location est après la fin ...");

        } else {
            // amount of hours per rate
            int heures1Franc = 0;
            int heures2Francs = 0;

            /*
            Intervals:
            00:00 - 07:00       (1.- / hour)
            07:00 - 17:00       (2.- / hour)
            17:00 - 24:00       (1.- / hour)
             */

            // calculate hours strictly within second interval
            if (debut >= 7 && fin < 17) {
                heures2Francs += fin - debut;
            } else

            // calculate hours strictly within first or third interval
            if (fin < 7 || debut >= 17) {
                heures1Franc += fin - debut;
            } else


            // mixed intervals
            if (debut < 7 && fin >= 17) {   // within all 3 intervals
                heures1Franc += (7 - debut) + (fin - 17);
                heures2Francs += 10;

            } else if (debut < 7) {         // within first and second interval
                heures1Franc += 7 - debut;
                heures2Francs += fin - 7;

            } else {                        // within second and third interval
                heures1Franc += fin - 17;
                heures2Francs += 17 - debut;
            }

            double total = heures1Franc + (heures2Francs * 2);

            System.out.println("Vous avez loué votre vélo pendant");
            if (heures1Franc != 0)
                System.out.printf("%d heure(s) au tarif horaire de 1.0 franc(s)\n", heures1Franc);

            if (heures2Francs != 0)
                System.out.printf("%d heure(s) au tarif horaire de 2.0 franc(s)\n", heures2Francs);

            System.out.print("Le montant total à payer est de ");
            System.out.print(total);
            System.out.println(" franc(s).");
        }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
