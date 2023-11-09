public class Week3 {
    public static void main(String[] args) {
        Character wizard =
                new Wizard("Bob", 100, 100, "Wand");

        Character thief =
            new Thief("Alice", 100, 100);

        // même si le type de la variable de wizard est Character, quand on appelle
        // meet(), la méthode meet() de Wizard est appelé.
        wizard.meet(thief);
        // ici la méthode meet de Thief est appelé.
        thief.meet(wizard);
        // on appelle cela polymorphisme, Java utilise une résolution dynamique des
        // liens pour déterminer quelle méthode doit être appelé.
    }
}

// super-classe pour les classes Wizard et Thief
class Character {
    // Le droit d'accès protected est moins stricte que private, ce droit d'accès assure la
    // visibilité pour toutes sous-classes et les classes du même paquetage. Il n'est pas recommandé
    // d'en utiliser.
    protected String name;
    int energy;
    int health;

    public Character(String name, int energy, int health) {
        this.name = name;
        this.energy = energy;
        this.health = health;
    }
    public void meet(Character c) {
        System.out.println("Hello, " + c.name);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", health=" + health +
                '}';
    }
}

// Classe Wizard qui hérite de la super-classe Character, Wizard est une sous-classe de la classe
// Character. On dit, Wizard est-un Character
class Wizard extends Character {
    String weapon;
    // Tous les autres attributs sont hérités de Character. On dit que Wizard est enrichie par les
    // attributs de Character.

    public Wizard(String name, int energy, int health, String weapon) {
        super(name, energy, health); // appel au constructeur de la classe Character pour l'initialisation
        this.weapon = weapon; // initialisation de l'attribut spécialisé
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "weapon='" + weapon + '\'' +
                "} " + super.toString();
    }
}

// Classe Thief qui hérite de la super-classe Character, Thief est une sous-classe de la classe
// Character. On dit, Thief est-un Character
class Thief extends Character {

    public Thief(String name, int energy, int health) {
        super(name, energy, health);
    }

    // méthode spécialisée pour Thief (= masquage)
    @Override
    public void meet(Character c) {
        super.meet(c); // appel à la méthode générale meet() de Character
        System.out.println(this.name + " has stolen from " + c.name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

