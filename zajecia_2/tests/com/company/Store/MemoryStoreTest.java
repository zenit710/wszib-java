package com.company.Store;

import com.company.Employee.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryStoreTest {

    private MemoryStore store;
    private Employee employee;

    @BeforeEach
    void setUp() {
        store = new MemoryStore();
        employee = new Employee("Jan", "Kowalski");
    }

    @Test
    void add() {
        assertEquals(store.getArrayList().size(), 0);

        store.add(employee);
        assertEquals(store.getArrayList().size(), 1);
    }

    @Test
    void getCountOfSameNames() {
        Employee differentEmplyee = new Employee("Piotr", "Nowak");

        assertEquals(store.getCountOfSameNames(employee), 0);

        store.add(employee);
        assertEquals(store.getCountOfSameNames(employee), 1);
        assertEquals(store.getCountOfSameNames(differentEmplyee), 0);

        store.add(differentEmplyee);
        assertEquals(store.getCountOfSameNames(employee), 1);
        assertEquals(store.getCountOfSameNames(differentEmplyee), 1);
    }

    @Test
    void getArrayList() {
        assertEquals(store.getArrayList().getClass().getName(), "java.util.ArrayList");
    }
}