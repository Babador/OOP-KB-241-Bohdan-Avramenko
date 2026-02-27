package lab01;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int totalBill = sc.nextInt();
            int friendsCount = sc.nextInt();
            if (totalBill < 0 || friendsCount <= 0) {
                System.out.println("Invalid input");
            } else {
                double totalWithTips = totalBill + (totalBill * 0.1);
                int part = (int) (totalWithTips / friendsCount);
                System.out.println(part);
            }
        }
    }
}