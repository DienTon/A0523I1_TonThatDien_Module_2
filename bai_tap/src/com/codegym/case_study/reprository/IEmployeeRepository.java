package com.codegym.case_study.reprository;

import com.codegym.case_study.model.Employee;

public interface IEmployeeRepository {
    void displayEmloyee();

    void addEmloyee(Employee employee);

    void editEmloyee(String id, Employee employee);


}
