public class DefensiveCopies {
    public static void main(String[] args) {
        System.out.println("Unprotected:");
        Sensitive sensitive = new Sensitive(5, new Other(3));
        System.out.println(sensitive);
        sensitive.getOther().setA(8);
        System.out.println(sensitive);

        System.out.println("---");

        System.out.println("Protected");
        SensitiveProtected sensitiveProtected = new SensitiveProtected(5, new Other(3));
        System.out.println(sensitiveProtected);
        sensitiveProtected.getOther().setA(8);
        System.out.println(sensitiveProtected);
    }
}

class Sensitive {
    // The contents of an instance of this class should not be changed.
    private int x;
    private Other other;

    public Sensitive(int x, Other other) {
        this.x = x;
        this.other = other;
    }

    public Other getOther() {
        return other;
        // this exposes the reference to the Other object, which can be changed by Other::setA()
    }

    @Override
    public String toString() {
        return "Sensitive{" +
                "x=" + x +
                ", other=" + other.toString() +
                '}';
    }
}

class SensitiveProtected {
    private int x;
    private Other other;

    public SensitiveProtected(int x, Other other) {
        this.x = x;
        this.other = other;
    }

    public Other getOther() {
        return new Other(this.other);
        // this returns a new copy of this.other which has a different reference and so the
        // instance is protected.
    }

    @Override
    public String toString() {
        return "SensitiveProtected{" +
                "x=" + x +
                ", other=" + other.toString() +
                '}';
    }
}

class Other {
    // general class
    private int a;
    public Other(int a) {
        this.a = a;
    }

    // constructor to create defensive copy
    public Other(Other other) {
        this.a = other.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Other{" +
                "a=" + a +
                '}';
    }
}
