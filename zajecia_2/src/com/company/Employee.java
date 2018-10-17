package com.company;

public class Employee {
    private String name;
    private String surname;
    private String email = "";

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean hasSameName(Employee e)
    {
        return name.equals(e.getName()) && surname.equals(e.getSurname());
    }

    public String __toString() {
        return name + " " + surname + " - " + email;
    }
}
