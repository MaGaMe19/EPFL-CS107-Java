public class Week4 {
    public static void main(String[] args) {
        Figure circle = new Circle(15);
        System.out.println(circle.surface());
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
   private double radius;

   public Circle(double r) {
       this.radius = r;
   }

    @Override
    public double circumference() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public double surface() {
        return Math.PI * this.radius * this.radius;
    }
}