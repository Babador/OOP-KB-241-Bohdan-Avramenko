package lab02;

public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        // Перевірка на виродженість
        if (start.x == end.x && start.y == end.y) {
            throw new IllegalArgumentException("Відрізок не може бути точкою (початок і кінець збігаються)");
        }
        this.start = start;
        this.end = end;
    }

    // Метод для знаходження довжини
    public double length() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }
    // Метод для знаходження середини відрізка
    public Point middle() {
        return new Point((start.x + end.x) / 2.0, (start.y + end.y) / 2.0);
    }
    // Метод для знаходження точки перетину
    public Point intersection(Segment another) {
        double x1 = start.x, y1 = start.y;
        double x2 = end.x, y2 = end.y;
        double x3 = another.start.x, y3 = another.start.y;
        double x4 = another.end.x, y4 = another.end.y;

        double denom = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);
        if (denom == 0) return null; // Відрізки паралельні

        double ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / denom;
        double ub = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / denom;
        // Перевірка, чи точка перетину лежить саме на відрізках
        if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1) {
            return new Point(x1 + ua * (x2 - x1), y1 + ua * (y2 - y1));
        }
        return null;
    }
}