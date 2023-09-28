import java.util.Scanner;

/* Programme pour calculer le IMC (indice de masse corporelle) d'une personne. (IMC = BMI)
C'est calculé par la formule suivante: IMC = poids [kg] / taille^2 [m] */

public class IMC {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);

        System.out.print("Poids [kg]: ");
        double poids = bob.nextDouble();

        System.out.print("Taille [m]: ");
        double taille = bob.nextDouble();

        double imc = poids / (taille * taille);
        System.out.printf("Ton IMC est egale a %.2f!", imc);
    }
}
