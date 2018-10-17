package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employees employees = new Employees(new MemoryStore());
        Scanner scanner = new Scanner(System.in);
        int command = -1;

        while (command != 0) {
            System.out.println("Wybierz akcję, którą chcesz wykonać");
            System.out.println("1 - Dodaj nowego pracownika");
            System.out.println("2 - Pokaż pracowników");
            System.out.println("0 - Zakończ program");

            command = scanner.nextInt();

            switch (command) {
                case 0:
                    return;

                case 1:
                    System.out.println(employees.add());
                    break;

                case 2:
                    employees.show();

                default:
            }
        }
    }
}
