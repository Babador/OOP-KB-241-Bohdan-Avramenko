package lab01;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(x1 + " " + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                System.out.println("no roots");
            }
        }
    }
}