public class Week1_2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Création des instances de Rectangle
        Rectangle a = new Rectangle(15.27, 89.31);
        System.out.println(a.area());

        Rectangle b = new Rectangle(30, 40);
        System.out.println(b.getDiagonal());

        // appel de la méthode statique
        Rectangle.printRectangle(b);

        // changer la valeur de "width" de b
        b.setWidth(75);
        Rectangle.printRectangle(b);

        // création d'un carré
        Rectangle square = new Rectangle(2);
        Rectangle.printRectangle(square);

        // création d'un rectangle défaut
        Rectangle defaultRec = new Rectangle();
        System.out.println(defaultRec.area());

        // copier le rectangle a
        Rectangle copyA = new Rectangle(a);
        System.out.println(copyA.getDiagonal());

        // afficher un rectangle avec println grâce à toString()
        System.out.println(defaultRec);

        // vérifier que a et copyA sont égaux
        System.out.println(a.equals(copyA));
    }
}

// Toutes les choses publiques dans la classe font partie de l'interface, les choses privées font
// partie de l'implémentation
class Rectangle {
    /* Ce sont les attributs, par convention, ils sont "private" parce qu'ils ne doivent pas être
    accessibles pour l'utilisateur / l'utilisatrice. Mais on peut définir des méthodes pour les
    accéder si cela est nécessaire. */
    private double width;
    private final double height;
    private final double diagonal;

    // constructeur par défaut, aucuns paramètres
    public Rectangle() {
        this(10, 20); // appel au constructeur plus général
    }

    // constructeur, initialisation de l'objet
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.diagonal = Math.sqrt((this.width * this.width) + (this.height * this.height));
    }

    // constructeur surchargé, qui construit un carré

    /**
     * Makes a square
     */
    public Rectangle(double sideLength) {
        this.width = sideLength;
        this.height = sideLength;
        this.diagonal = 2 * (this.width * this.width);
    }

    // constructeur de copie, prend un Rectangle comme paramètre et crée un nouveau rectangle comme
    // copie de l'original
    public Rectangle(Rectangle original) {
        this(original.width, original.height);
    }

    // méthode "normale"
    public double area() {
        return width * height;
    }

    // méthode accesseur, retourne la valeur d'un attribut qui est normalement inaccessible
    public double getDiagonal() {
        return diagonal;
    }

    // méthode manipulateur, change la valeur d'un attribut qui est normalement inaccessible
    public void setWidth(double width) {
        this.width = width;
    }

    // méthode toString, il faut déclarer cette méthode si on veut utiliser println(Rectangle),
    // parce que Java essaye d'appeler cette méthode automatiquement
    public String toString() {
        return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            ", diagonal=" + diagonal +
            '}';
    }

    // méthode equals(), on doit déclarer cette méthode parce que les opérateurs de comparaison
    // == et != ne fonctionne pas avec des classes personnalisées
    public boolean equals(Rectangle other) {
        return (other != null) && (this.width == other.width && this.height == other.height);
    }

    // méthode statique, on peut l'appeler sans avoir créé une instance de la classe
    public static void printRectangle(Rectangle rec) {
        // noter que ici on peut accéder les attributs parce qu'on est encore dans la classe
        System.out.printf("Width: %.3f, Height: %.3f\n", rec.width, rec.height);
    }
}