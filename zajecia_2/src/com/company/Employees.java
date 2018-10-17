package com.company;

import java.util.Scanner;

public class Employees {
    private final String EMAIL_PATTERN = "%s.%s%s@mex.com";

    private StoreInterface store;
    private Scanner scanner = new Scanner(System.in);

    public Employees(StoreInterface store) {
        this.store = store;
    }

    public String add() {
        String name, surname;

        System.out.println("Podaj imię: ");
        name = scanner.next();

        System.out.println("Podaj nazwisko: ");
        surname = scanner.next();

        Employee employee = new Employee(name, surname);

        employee.setEmail(generateEmail(employee));

        store.add(employee);

        return employee.getEmail();
    }

    public void show() {
        store.show();
    }

    private String generateEmail(Employee e) {
        int sameNamesEmployeesCount = store.getCountOfSameNames(e);
        String postfix = sameNamesEmployeesCount > 0 ? String.valueOf(sameNamesEmployeesCount) : "";

        return String.format(
                this.EMAIL_PATTERN,
                e.getName().toLowerCase(),
                e.getSurname().toLowerCase(),
                postfix
        );
    }
}
