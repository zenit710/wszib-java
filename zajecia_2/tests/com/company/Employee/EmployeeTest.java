package com.company.Employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("Jan", "Kowalski", "jan.kowalski@mex.com");
    }

    @Test
    void getName() {
        assertEquals(employee.getName(), "Jan");
    }

    @Test
    void getSurname() {
        assertEquals(employee.getSurname(), "Kowalski");
    }

    @Test
    void getEmail() {
        assertEquals(employee.getEmail(), "jan.kowalski@mex.com");
    }

    @Test
    void setEmail() {
        employee.setEmail("kowalski.jan@mex.com");

        assertEquals(employee.getEmail(), "kowalski.jan@mex.com");
    }

    @Test
    void hasSameName() {
        Employee sameName = new Employee("Jan", "Kowalski");
        Employee nameCharSizeDiff = new Employee("jan", "Kowalski");
        Employee surnameCharSizeDiff = new Employee("Jan", "kowalski");
        Employee differentName = new Employee("Jack", "Kowalski");
        Employee differentSurname = new Employee("Jan", "Nowak");

        assertTrue(employee.hasSameName(sameName));
        assertTrue(employee.hasSameName(nameCharSizeDiff));
        assertTrue(employee.hasSameName(surnameCharSizeDiff));
        assertFalse(employee.hasSameName(differentName));
        assertFalse(employee.hasSameName(differentSurname));
    }

    @Test
    void _toString() {
        assertEquals(employee.toString(), "Jan Kowalski - jan.kowalski@mex.com");
    }
}