public class Week5 {
    public static void main(String[] args) {
        Cube cube = new Cube();
        boolean hit = cube.hit(new Cube());
        boolean bb = cube.boundingBox(new Object());

        System.out.printf("%b, %b\n", hit, bb);

        System.out.println(Direction.UP);
    }
}

class Cube implements Hittable {
    @Override
    public boolean hit(Object other) {
        return true;
    }

    @Override
    public boolean boundingBox(Object outputBox) {
        return false;
    }
}

interface Hittable {
   boolean hit(Object other);
   boolean boundingBox(Object outputBox);
}

enum Direction {
    UP, DOWN, LEFT, RIGHT;
}