package lab04;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== РЕЗУЛЬТАТИ ТЕСТУВАННЯ ЛАБОРАТОРНОЇ 4 ===\n");

        Figure triangle = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
        System.out.println(triangle);
        System.out.println("Площа: " + triangle.area());
        System.out.println("Центроїд: " + triangle.centroid());
        System.out.println("----------------------------------------");

        Figure quad = new Quadrilateral(new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(0, 2));
        System.out.println(quad);
        System.out.println("Площа: " + quad.area());
        System.out.println("Центроїд: " + quad.centroid());
        System.out.println("----------------------------------------");

        Figure circle = new Circle(new Point(5, 5), 3);
        System.out.println(circle);
        System.out.println("Площа: " + circle.area());
        System.out.println("Центроїд: " + circle.centroid());
        System.out.println("----------------------------------------");
    }
}