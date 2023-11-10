class FiguresGeometriques {

	public static void main(String[] args) {
		RectangleColore rec =
				new RectangleColore(1.5, 2.5, 3.141, 2.718, 128);
		rec.affiche();
	}
}

class Figure {
	private double x;
	private double y;

	// constructeur par défaut, pour qu'on puisse créer une figure avec aucunes coordonnées
	public Figure() {
		this.x = 0;
		this.y = 0;
	}

	public Figure(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.printf("{x = %.3f, y = %.3f}\n", this.x, this.y);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}

class Rectangle extends Figure {
	private double largeur;
	private double longueur;

	public Rectangle(double largeur, double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public Rectangle(double x, double y, double largeur, double longueur) {
		super(x, y);
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public void affiche() {
		super.affiche();
		System.out.printf("{largeur = %.3f, longueur = %.3f}\n", this.largeur, this.longueur);
	}

	public double surface() {
		return largeur * longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double l) {
		largeur = l;
	}

	public void setLongueur(double l) {
		longueur = l;
	}
}

class RectangleColore extends Rectangle {
	private int couleur;

	public RectangleColore(double largeur, double hauteur, int couleur) {
		super(largeur, hauteur);
		this.couleur = couleur;
	}

	public RectangleColore(double x, double y, double largeur, double longueur, int couleur) {
		super(x, y, largeur, longueur);
		this.couleur = couleur;
	}

	@Override
	public void affiche() {
		super.affiche();
		System.out.printf("{couleur = %d}\n", this.couleur);
	}
}

class Cercle extends Figure {
	private double rayon;

	public Cercle(double x, double y, double r) {
		super(x, y);
		rayon = r;
	}

	@Override
	public void affiche() {
		super.affiche();
		System.out.printf("{rayon = %.3f}\n", this.rayon);
	}

	public double surface() {
		return Math.PI * rayon * rayon;
	}

	public boolean estInterieur(double x, double y) {
		return (((x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY()))
					<= rayon * rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double r) {
		if (r < 0.0) r = 0.0;
		rayon = r;
	}
}
