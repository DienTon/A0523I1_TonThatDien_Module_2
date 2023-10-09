package com.codegym.case_study.reprository;

import com.codegym.case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getListEmloyee();
    void displayEmloyee();

    void addEmloyee(Employee employee);

    void editEmloyee(String id, List<Employee> employees);


}
