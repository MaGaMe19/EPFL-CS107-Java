public class Geometrie {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(),
                new Point(2.5, 2.5),
                new Point(0, 5)
        );

        System.out.println(triangle.circumference());
        System.out.println(triangle.isIsosceles());
    }
}

class Triangle {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    private final Point[] points;

    public Triangle() {
        this(new Point(), new Point(), new Point());
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.points = new Point[]{p1, p2, p3};
    }

    /** Calculates the given side of the triangle with 'num' being the point
     * at which the side starts. So with num = 1, the side from p1 to p2 would
     * be calculated.
     */
    private double calculateSide(int from, int to) {
        return Math.sqrt(
                Math.pow(this.points[from].getX() - this.points[to].getX(), 2) +
                        Math.pow(this.points[from].getY() - this.points[to].getY(), 2)
        );
    }

    public double circumference() {
        return calculateSide(0, 1) + calculateSide(1, 2) + calculateSide(0, 2);
    }

    public boolean isIsosceles() {
        double side1 = calculateSide(0, 1);
        double side2 = calculateSide(1, 2);
        double side3 = calculateSide(0, 2);

        return (side1 == side2 || side1 == side3 || side2 == side3);
    }
}

class Point {
    private final double x;
    private final double y;

    public Point() {
        this(0.0, 0.0);
    }
    public Point(double x, double y) {
       this.x = x;
       this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}