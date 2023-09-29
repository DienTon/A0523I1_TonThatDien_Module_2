package com.codegym.case_study.reprository.impl;

import com.codegym.case_study.model.Employee;
import com.codegym.case_study.model.Person;
import com.codegym.case_study.reprository.IEmployeeRepository;
import com.codegym.case_study.service.impl.EmployeeService;
import com.codegym.case_study.utils.FileHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String PATH = "case_study/data/employee.csv";
    FileHelper fileHelper = new FileHelper();
    @Override
    public void displayEmloyee() {
        List<Employee> list = fileHelper.readFile(PATH);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Override
    public void addEmloyee(Employee employee) {
        EmployeeService service = new EmployeeService();
        List<Employee> list = fileHelper.readFile(PATH);
        try {
            for (int i = 0; i < list.size(); i++) {
                if (employee.getId().equalsIgnoreCase(list.get(i).getId())){
                    System.out.println("id da ton tai.");
                    return;
                }
            }
            list.add(employee);
            fileHelper.writeFile(PATH, list);
            System.out.println("add thanh cong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void editEmloyee(String id, Employee employee) {
        List<Employee> employees = fileHelper.readFile(PATH);
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getId().equals(id)){
                employees.set(i, employee);
                System.out.println("edit thanh cong" +
                        "");
                return;
            }
        }
        System.out.println("id khong ton tai");
    }

    public static void main(String[] args) {
        EmployeeRepository em = new EmployeeRepository();
        em.displayEmloyee();
    }
}
