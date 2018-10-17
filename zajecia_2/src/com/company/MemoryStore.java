package com.company;

import java.util.ArrayList;

public class MemoryStore implements StoreInterface {
    ArrayList<Employee> store = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        store.add(employee);
    }

    @Override
    public int getCountOfSameNames(Employee employee) {
        int count = 0;

        for (int i = 0; i < store.size(); i++) {
            if (employee.hasSameName(store.get(i))) {
                count++;
            }
        }

        return count;
    }

    @Override
    public void show() {
        for (int i = 0; i < store.size(); i++) {
            System.out.println(store.get(i).__toString());
        }
    }
}
