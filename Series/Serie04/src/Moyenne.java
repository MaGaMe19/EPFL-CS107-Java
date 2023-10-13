import java.util.Scanner;
class Moyenne {
    private static final Scanner bob = new Scanner(System.in);
    public static void main(String[] args) {

        // Demande le nombre d'étudiants à l'utilisateur
        int nombreEtudiants;
        System.out.print("Donnez le nombre d'etudiants : ");
        nombreEtudiants = bob.nextInt();

        double somme = 0.0;
        // Initialise un tableau pouvant contenir autant
        // de notes que d'étudiants

        double[] notes = new double[nombreEtudiants];

        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.printf("Note d'etudiant %d [double] : ", i);

            // stocke la note du ième étudiant dans la ième
            // case du tableau

            double note = bob.nextDouble();
            notes[i] = note;
            somme += note;
        }

        double moyenne = somme / nombreEtudiants;

        System.out.printf("\nMoyenne de classe : %.2f\n", moyenne);
        System.out.println("\nEtudiant : note (ecart a la moyenne)");

        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.printf("       %d : %.2f (%.2f)\n",
                    i, notes[i], notes[i] - moyenne);
        }
    }
}