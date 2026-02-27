package lab01;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 7, 4};
        int[] array2 = {1, 3, 2, 7, 4};

        cycleSwap(array1);
        System.out.println("Зсув на 1: " + Arrays.toString(array1));

        cycleSwap(array2, 3);
        System.out.println("Зсув на 3: " + Arrays.toString(array2));
    }
    public static void cycleSwap(int[] array) {
        if (array.length <= 1) return;
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }
    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1 || shift == 0 || shift == array.length) return;
        int[] copy = array.clone();
        for (int i = 0; i < array.length; i++) {
            int newPos = (i + shift) % array.length;
            array[newPos] = copy[i];
        }
    }
}