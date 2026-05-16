package lab04;

public class Circle extends Figure {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        if (center == null) {
            throw new IllegalArgumentException("Center point cannot be null");
        }
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle is degenerate (radius must be > 0)!");
        }
        this.center = center;
        this.radius = radius;
    }

    // Площа кола: PI * R^2
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Центроїд кола — це сам його центр
    @Override
    public Point centroid() {
        return center;
    }

    // Форматований вивід: Circle[(x,y) Radius]
    @Override
    public String toString() {
        String rStr = radius % 1 == 0 ? String.format("%.0f", radius) : String.valueOf(radius);
        return "Circle[" + center + " " + rStr + "]";
    }
}