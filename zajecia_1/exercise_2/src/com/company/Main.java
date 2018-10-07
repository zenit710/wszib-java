package com.company;

import java.util.Scanner;

public class Main {
    private static final int NUMBERS_COUNT = 3;
    private static final int UNLUCKY_NUMBER = 13;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Podaj 3 liczby");

        for (int i = 0; i < NUMBERS_COUNT; i++) {
            int userInput = scanner.nextInt();

            if (userInput == UNLUCKY_NUMBER) {
                break;
            }

            sum += userInput;
        }

        System.out.println("Suma podanych przez Ciebie liczb to: " + sum);
    }
}
