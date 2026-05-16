package lab01;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            if (sc.hasNextInt()) {
                int current = sc.nextInt();
                if (current == 0) {
                    break;
                }
                sum += current;
                count++;
            }
        }
        if (count > 0) {
            int average = sum / count;
            System.out.println(average);
        }
    }
}