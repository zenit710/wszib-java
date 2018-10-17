package com.company;

import java.util.ArrayList;

public interface StoreInterface {
    public void add(Employee employee);
    public int getCountOfSameNames(Employee employee);
    public ArrayList<Employee> getArrayList();
}
