package com.company.Store;

import com.company.Employee.Employee;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileStore implements StoreInterface {
    private final String filePath = "employees.txt";
    private final String propertyDelimiter = ";";

    @Override
    public void add(Employee employee) {
        String line = String.join(
                propertyDelimiter,
                employee.getName(),
                employee.getSurname(),
                employee.getEmail()
        );

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
            PrintWriter writer = new PrintWriter(bufferedWriter);

            writer.println(line);
            writer.close();
        } catch (IOException e) {
            System.out.println("Couldn't add new employee: " + e.getMessage());
        }
    }

    @Override
    public int getCountOfSameNames(Employee employee) {
        ArrayList<Employee> employees = getArrayList();
        int count = 0;

        for (Employee e: employees) {
            if (employee.hasSameName(e)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public ArrayList<Employee> getArrayList() {
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNext()) {
                String[] parts = scanner.next().split(propertyDelimiter);
                employees.add(new Employee(parts[0], parts[1], parts[2]));
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Can't store employees in file: " + e.getMessage());
        }

        return employees;
    }
}
