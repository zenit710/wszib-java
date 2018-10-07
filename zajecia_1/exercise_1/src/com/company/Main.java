package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą z liczb");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj drugą z liczb");
	    int secondNumber = scanner.nextInt();

	    boolean isFirstTeen = isTeen(firstNumber);
	    boolean isSecondTeen = isTeen(secondNumber);

	    boolean result = (isFirstTeen || isSecondTeen) && !(isFirstTeen && isSecondTeen);

	    System.out.println(result);
    }

    private static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }
}
