package com.company.Store;

import com.company.Employee.Employee;
import java.util.ArrayList;

public interface StoreInterface {
    public void add(Employee employee);
    public int getCountOfSameNames(Employee employee);
    public ArrayList<Employee> getArrayList();
}
