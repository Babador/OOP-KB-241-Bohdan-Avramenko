package lab04;

public class Quadrilateral extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (a == null || b == null || c == null || d == null) {
            throw new IllegalArgumentException("Points cannot be null");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        double areaABC = new Triangle(a, b, c).area();
        double areaACD = new Triangle(a, c, d).area();
        double areaABD = new Triangle(a, b, d).area();
        double areaBCD = new Triangle(b, c, d).area();

        if (Math.abs((areaABC + areaACD) - (areaABD + areaBCD)) > 0.000001 || area() <= 0.000001) {
            throw new IllegalArgumentException("Quadrilateral is degenerate or self-intersecting!");
        }
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(
                (a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * d.getY() + d.getX() * a.getY()) -
                        (b.getX() * a.getY() + c.getX() * b.getY() + d.getX() * c.getY() + a.getX() * d.getY())
        );
    }

    @Override
    public Point centroid() {
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);

        double s1 = t1.area();
        double s2 = t2.area();
        double totalArea = s1 + s2;

        Point c1 = t1.centroid();
        Point c2 = t2.centroid();

        double cx = (c1.getX() * s1 + c2.getX() * s2) / totalArea;
        double cy = (c1.getY() * s1 + c2.getY() * s2) / totalArea;

        return new Point(cx, cy);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + a + " B" + b + " C" + c + " D" + d + "]";
    }
}