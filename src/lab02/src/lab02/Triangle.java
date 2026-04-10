package lab02;

public class Triangle {
    private final Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        // Обчислюємо площу, щоб перевірити, чи існує трикутник
        double area = Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
        if (area == 0) {
            throw new IllegalArgumentException("Трикутник вироджений (точки лежать на одній прямій)");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Метод для обчислення площі
    public double area() {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
    }
    // Метод для знаходження центроїда
    public Point centroid() {
        return new Point((a.x + b.x + c.x) / 3.0, (a.y + b.y + c.y) / 3.0);
    }
}