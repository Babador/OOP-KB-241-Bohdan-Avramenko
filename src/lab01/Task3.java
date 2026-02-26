package lab01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretPassword = 1234;
        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input == secretPassword) {
                System.out.println("Hello, Agent");
            } else {
                System.out.println("Access denied"); }}}}