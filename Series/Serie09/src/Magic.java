import java.util.ArrayList;

class Magic {
	public static void main(String[] args) {
		Game game = new Game(10);

		game.draw(new Terrain('r'));
		game.draw(new Creature(10, "bob", 1000, 2000));
		game.draw(new Sorcery(20, "Fire", "damn that's hot"));
		game.print();
		System.out.println();
		game.play();
	}
}

class Game {
	private int nbCards;
	private ArrayList<Card> cards;
	public Game(int nbCards) {
		nbCards = Math.clamp(nbCards, 0, 10);
		this.nbCards = nbCards;

		cards = new ArrayList<>();
	}

	public void draw(Card card) {
		if (cards.size() < this.nbCards)
			cards.add(card);
		else System.out.println("Max number of cards in game.");
	}

	public void print() {
		for (Card card : this.cards) {
			System.out.println(card);
		}
	}

	public void play() {
		System.out.println("I play a card... it is:");
		System.out.println(this.cards.getFirst());
		this.cards.removeFirst();
	}
}

abstract class Card {
	private int cost;
	public Card(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return String.format("A %s - Cost: %d", getClass().getName(), this.cost);
	}}

class Terrain extends Card {
	private char color;
	public Terrain(char color) {
		super(0);
		this.color = color;
	}

	@Override
	public String toString() {
		String colorString;
		switch (color) {
			case 'B' -> colorString = "black";
			case 'w' -> colorString = "white";
			case 'r' -> colorString = "red";
			case 'g' -> colorString = "green";
			case 'b' -> colorString = "blue";
			default -> colorString = "yellow";
		}
		return super.toString() +
				String.format(", Color: %s", colorString);
	}
}

class Creature extends Card {
	private String name;
	private int defensePoints;
	private int healthPoints;

	public Creature(int cost, String name, int defensePoints, int healthPoints) {
		super(cost);
		this.name = name;
		this.defensePoints = defensePoints;
		this.healthPoints = healthPoints;
	}

	@Override
	public String toString() {
		return super.toString() +
				String.format(", Name: %s, Defense Points: %d, Health Points: %d",
						this.name, this.defensePoints, this.healthPoints);
	}
}

class Sorcery extends Card {
	private String name;
	private String description;

	public Sorcery(int cost, String name, String description) {
		super(cost);
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return super.toString() + "" +
				String.format(", Name: %s, Description: %s", this.name, this.description);
	}
}