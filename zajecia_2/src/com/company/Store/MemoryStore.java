package com.company.Store;

import com.company.Employee.Employee;
import java.util.ArrayList;

public class MemoryStore implements StoreInterface {
    private ArrayList<Employee> store = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        store.add(employee);
    }

    @Override
    public int getCountOfSameNames(Employee employee) {
        int count = 0;

        for (Employee e: store) {
            if (employee.hasSameName(e)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public ArrayList<Employee> getArrayList() {
        return store;
    }
}
