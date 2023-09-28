/* ce programme permette d'évaluer un polynôme du 3ème degré de la forme :
((a + b) / 2)*x^3 + (a + b)^2*x^2 + a + b + c */

import java.util.Scanner;

public class Degre3 {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);

        System.out.print("Entrez a [int] : ");
        int a = bob.nextInt();
        System.out.print("Entrez b [int] : ");
        int b = bob.nextInt();
        System.out.print("Entrez c [int] : ");
        int c = bob.nextInt();

        System.out.print("Entrez x [double] : ");
        double x = bob.nextDouble();

        double xCube = x * x * x;
        double resultat = ((double) (a + b) / 2) * xCube + (a + b) * (a + b) * x * x + a + b + c;

        System.out.printf("La valeur du polynome est : %.3f\n", resultat);
    }
}
