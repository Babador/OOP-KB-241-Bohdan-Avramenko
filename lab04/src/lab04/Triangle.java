package lab04;

public class Triangle extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Points cannot be null");
        }
        this.a = a;
        this.b = b;
        this.c = c;

        if (area() <= 0.000001) {
            throw new IllegalArgumentException("Triangle is degenerate (points lie on a line)!");
        }
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY()));
    }

    @Override
    public Point centroid() {
        double cx = (a.getX() + b.getX() + c.getX()) / 3.0;
        double cy = (a.getY() + b.getY() + c.getY()) / 3.0;
        return new Point(cx, cy);
    }

    @Override
    public String toString() {
        return "Triangle[A" + a + " B" + b + " C" + c + "]";
    }
}