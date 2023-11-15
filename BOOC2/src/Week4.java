public class Week4 {
    public static void main(String[] args) {
        Figure circle = new Circle(15);
        System.out.println(circle.surface());

        Figure square1 = new Square(20);
        System.out.println(square1.circumference());

        Figure square2 = new Square(30);
        System.out.printf("square1 equals square2: %b\n", square1.equals(square2));

        Figure square3 = new Square(30);
        System.out.printf("square2 equals square3: %b\n", square2.equals(square3));

        System.out.println(square1 instanceof Figure); // prints true, because Square extends Figure
        System.out.println(square1.getClass() == Figure.class); // prints false
    }
}

/* Une class abstraite ("abstract") n'est qu'un modèle pour définir des sous-classes. On ne peut pas
créer des instances de la classe abstraite, mais on peut définir des sous-classes qui en héritent.
Les méthodes dans la classe abstraite doivent être abstraites et toutes les sous-classes doivent les
implémenter */
abstract class Figure {
    public abstract double surface();
    public abstract double circumference();
}

class Circle extends Figure {
   private final double radius;

   public Circle(double r) {
       this.radius = r;
   }

    @Override
    public double surface() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double circumference() {
        return 2 * this.radius * Math.PI;
    }
}

class Square extends Figure {
    private final double length;

    public Square(double width) {
       this.length = width;
    }

    @Override
    public double surface() {
        return this.length * this.length;
    }

    @Override
    public double circumference() {
        return (this.length * 4);
    }

    @Override
    public boolean equals(Object obj) {
        return
            obj != null &&
            obj.getClass() == this.getClass() &&
            this.length == ((Square) obj).length;
    }
}