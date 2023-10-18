public class Week6 {
    // Chapitre 22 : Méthodes (Introduction)

    //            type  nom    paramètres
    public static int crazyOp(int a, int b) { // entête
        int c = a + b % 10;             // |
        int d = c * a - b;              // | corps de la méthode
        int e = d - a + c;              // |

        return c * d + e;               // | valeur de retour
    } // définition
    public static void main(String[] args) {
        System.out.println(crazyOp(12, 7)); // appel
    }
}
