package lab01;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int count = sc.nextInt();
            sc.nextLine();
            if (count > 0) {
                for (int i = 0; i < count; i++) {
                    String name = sc.nextLine();
                    System.out.println("Hello, " + name); }
            } else if (count == 0) {
                System.out.println("Щось не так..."); }}}}