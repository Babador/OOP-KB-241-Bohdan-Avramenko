package lab01;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            if (sc.hasNextInt()) {
                numbers[i] = sc.nextInt();
            }
        }

        System.out.println(max(numbers));
    }

    public static int max(int[] array) {
        int maxVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        return maxVal;
    }
}