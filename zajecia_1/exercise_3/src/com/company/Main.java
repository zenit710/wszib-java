package com.company;

import java.util.Scanner;

public class Main {
    private static final int[] NEEDED_SEQUENCE = {1, 2, 3};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile elementów chcesz wprowadzić do tablicy?");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Podaj kolejne elementy tablicy");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int sequencePosition = 0;
        boolean result = false;

        for (int number: array) {
            if (number == NEEDED_SEQUENCE[sequencePosition]) {
                sequencePosition++;
            }

            if (sequencePosition == NEEDED_SEQUENCE.length) {
                result = true;

                break;
            }
        }

        System.out.println(result);
    }
}
