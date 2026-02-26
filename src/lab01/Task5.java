package lab01;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int h = sc.nextInt();
            if (a <= b && a < h) {
                System.out.println("Impossible");
            } else {
                int days = 0;
                int currentHeight = 0;
                while (true) {
                    days++;
                    currentHeight += a;
                    if (currentHeight >= h) {
                        System.out.println(days);
                        break;
                    }
                    currentHeight -= b;
                }
            }
        }
    }
}