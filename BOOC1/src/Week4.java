public class Week4 {
    public static void main(String[] args) {
        // Chapitre 14 : Tableaux de taille fixe (déclaration)
        // première manière d'initialisation : initialiser le tableau avec des éléments donnés au moment de sa déclaration
        double[] numbers = {3.141, 1.618, 2.718};

        // on peut accéder un élément avec son index :
        System.out.printf("Numbers: %.3f, %.3f, %.3f\n", numbers[0], numbers[1], numbers[2]);

        // seconde manière d'initialisation : initialiser le tableau sans éléments, mais avec une taille fixe
        int[] scores = new int[3];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = i % 2 == 0 ? i + 3 : i + 1;
        }

        // ou on peut itérer sur tous les éléments :
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("\n");

        // Chapitre 17 : Tableaux à plusieurs dimensions
        int[][] x = new int[3][3];

        // remplir le tableau :
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (j + 1) + ((i) * x[i].length);
            }
        }

        // afficher le tableau :
        for (int[] e : x) {
            for (int a : e) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
