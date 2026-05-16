package lab01;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[] array = {18, 1, 3, 6, 7, 15, 2, 12, 14};

        int[] result = removeLocalMaxima(array);

        System.out.println("Було: " + Arrays.toString(array));
        System.out.println("Стало:   " + Arrays.toString(result));
    }

    public static int[] removeLocalMaxima(int[] array) {
        int[] temp = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isLocalMaximum = false;

            if (i == 0) {
                if (array[i] > array[i + 1]) isLocalMaximum = true;
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) isLocalMaximum = true;
            } else {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) isLocalMaximum = true;
            }
            if (!isLocalMaximum) {
                temp[count++] = array[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
}