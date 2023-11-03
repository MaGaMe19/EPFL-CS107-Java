public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Square square = new Square(15);
        System.out.println(square.area());

        Square square1 = new Square(15);
        System.out.println(square.equals(square1));
    }
}

class Square {
    private final double length;
    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return this.length * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + this.length +
                '}';
    }
}