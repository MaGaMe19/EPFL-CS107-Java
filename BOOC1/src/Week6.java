public class Week6 {
    // Chapitre 22 : Méthodes (Introduction)

    //            type  nom    paramètres
    public static int crazyOp(int a, int b) { // entête
        int c = a + b % 10;             // |
        int d = c * a - b;              // | corps de la méthode
        int e = d - a + c;              // |

        return c * d + e;               // | valeur de retour
    } // définition


    // Chapitre 24 : Passage des arguments :
    /* arguments de type simple sont passé par valeur, donc une modification
    dans la méthode n'aura pas de conséquences sur sa valeur en dehors */
    static void m(int x) {
        x = x + 1;
        System.out.println("x = " + x);
    }

    /* arguments de type évolué sont passé par référence, donc une modification
    dans la méthode va aussi modifier la valeur en dehors */
    static void m(int[] x) {
        x[0] = 100;
        System.out.println("x[0] = " + x[0]);
    }


    // Chapitre 28 : Surcharge (Overloading)
    static void display(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // cas défaut, afficher 5 fois
    static void display(char c) {
        display(c, 5);
    }

    public static void main(String[] args) {
        System.out.println(crazyOp(12, 7)); // appel;

        int a = 5;
        int[] b = {2};

        m(a);
        System.out.println("a = " + a);

        m(b);
        System.out.println("b[0] = " + b[0]);

        display('*');
    }
}
