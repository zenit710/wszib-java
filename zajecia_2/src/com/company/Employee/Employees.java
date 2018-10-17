package com.company.Employee;

import com.company.Store.StoreInterface;
import java.util.ArrayList;

public class Employees {
    private final String EMAIL_PATTERN = "%s.%s%s@mex.com";

    private StoreInterface store;

    public Employees(StoreInterface store) {
        this.store = store;
    }

    public Employee add(String name, String surname) {
        Employee employee = new Employee(name, surname);
        employee.setEmail(generateEmail(employee));

        store.add(employee);

        return employee;
    }

    public void show() {
        ArrayList<Employee> employees = store.getArrayList();

        for (Employee e: employees) {
            System.out.println(e.__toString());
        }
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
