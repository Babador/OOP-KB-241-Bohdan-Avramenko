package lab01;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 7, 10};

        boolean[] result = getSumCheckArray(input);

        System.out.println(Arrays.toString(result));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] checkArray = new boolean[array.length];

        checkArray[0] = false;
        checkArray[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                checkArray[i] = true;
            } else {
                checkArray[i] = false;
            }
        }
        return checkArray;
    }
}