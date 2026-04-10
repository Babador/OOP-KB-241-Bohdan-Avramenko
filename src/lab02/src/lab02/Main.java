package lab02;

public class Main {
    public static void main(String[] args) {
        testLine();
        testSegment();
        testTriangle();
    }

    private static void testLine() {
        System.out.println("--- Line Test ---");
        Line l1 = new Line(1, 1);
        Line l2 = new Line(-1, 3);
        System.out.println("Result: " + l1.intersection(l2));
    }

    private static void testSegment() {
        System.out.println("--- Segment Test ---");
        Segment s1 = new Segment(new Point(0, 0), new Point(4, 4));
        System.out.println("Length: " + s1.length());
    }

    private static void testTriangle() {
        System.out.println("--- Triangle Test ---");
        Triangle tr = new Triangle(new Point(0,0), new Point(3,0), new Point(0,4));
        System.out.println("Area: " + tr.area());
    }
}