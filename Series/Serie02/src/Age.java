// programme pour calculer l'année de naissance qui correspond à l'age qui est donné par l'utilisateur

import java.time.LocalDate;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int anneeCourante = LocalDate.now().getYear(); // c'est un peu overkill pour cette exercise

        Scanner bob = new Scanner(System.in);
        System.out.print("Quel age as tu? ");
        int age = bob.nextInt();

        int annee = anneeCourante - age;
        System.out.printf("Ta annee de naissance est: %d", annee);
    }
}
