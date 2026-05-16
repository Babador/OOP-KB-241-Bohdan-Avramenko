package lab01;

public class Task11 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(sum(numbers));
    }
    public static int sum(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int totalSum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                totalSum += number;
            }
        }
        return totalSum;
    }
}