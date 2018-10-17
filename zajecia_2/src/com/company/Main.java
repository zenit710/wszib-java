package com.company;

import com.company.Employee.Employee;
import com.company.Employee.Employees;
import com.company.Store.FileStore;
import com.company.Store.MemoryStore;
import com.company.Store.StoreInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StoreInterface store;
        Employees employees;
        Scanner scanner = new Scanner(System.in);
        int mode = 0;
        int command = -1;

        while (mode < 1 || mode > 2) {
            System.out.println("mode: " + mode);
            System.out.println("Select store mode: ");
            System.out.println("1 - store employees in file");
            System.out.println("2 - store employees in memory");

            mode = scanner.nextInt();
            System.out.println("mode: " + mode);
        }

        store = mode == 1 ? new FileStore() : new MemoryStore();
        employees = new Employees(store);

        while (command != 0) {
            System.out.println("What you want to do?");
            System.out.println("1 - Add new employee");
            System.out.println("2 - Show employees");
            System.out.println("0 - Exit");

            command = scanner.nextInt();

            switch (command) {
                case 0:
                    return;

                case 1:
                    String name, surname;

                    System.out.println("Provide name: ");
                    name = scanner.next();

                    System.out.println("Provide surname: ");
                    surname = scanner.next();

                    Employee e = employees.add(name, surname);
                    System.out.println("Employee email address: " + e.getEmail());
                    break;

                case 2:
                    employees.show();

                default:
            }
        }
    }
}
