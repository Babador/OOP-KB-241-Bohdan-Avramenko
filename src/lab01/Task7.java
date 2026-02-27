package lab01;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        if (max != 0) {
            while (true) {
                int current = sc.nextInt();
                if (current == 0) {
                    break;
                }
                if (current > max) {
                    max = current;
                }
            }
            System.out.println(max);
        }
    }
}