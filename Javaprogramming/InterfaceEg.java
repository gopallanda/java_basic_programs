interface Area {
    double PI = 3.1432;

    void circle(int r);

    void rectangle(int l, int b);

    void square(int l);

    void triangle(int b, int h);
}

class ShapeArea implements Area {
    public void circle(int r) {
        System.out.println("area of a circle:" + PI * r * r);
    }

    public void rectangle(int l, int b) {
        System.out.println("area of a rectangle:" + 2 * (l + b));

    }

    public void square(int l) {
        System.out.println("area of a rectangle:" + l * l);

    }

    public void triangle(int b, int h) {
        System.out.println("area of a rectangle:" + (1 / 2) * (b * h));

    }

}

public class InterfaceEg {
    public static void main(String[] args) {
        ShapeArea cs = new ShapeArea();
        cs.circle(3);
        cs.rectangle(3, 4);
        cs.square(3);
        cs.triangle(3, 4);

    }

}
