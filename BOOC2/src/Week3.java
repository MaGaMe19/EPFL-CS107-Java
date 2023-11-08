public class Week3 {
    public static void main(String[] args) {
        Character wizard =
                new Wizard("Bob", 100, 100, "Wand");
        System.out.println(wizard);
    }
}

class Character {
    String name;
    int energy;
    int health;

    public Character(String name, int energy, int health) {
        this.name = name;
        this.energy = energy;
        this.health = health;
    }
    public void meet(Character c) {
        System.out.println(c.name);
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

class Wizard extends Character {
    String weapon;

    public Wizard(String name, int energy, int health, String weapon) {
        super(name, energy, health);
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "weapon='" + weapon + '\'' +
                "} " + super.toString();
    }
}
