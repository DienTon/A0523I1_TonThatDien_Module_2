package com.codegym.case_study.reprository.impl;

import com.codegym.case_study.model.person.Employee;
import com.codegym.case_study.reprository.IEmployeeRepository;
import com.codegym.case_study.utils.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH = "D:\\CodeGym\\A0523I1-TonThatDien\\Module2\\bai_tap\\src\\com\\codegym\\case_study\\data\\employee.csv";
    FileHelper fileHelper = new FileHelper();

    @Override
    public List<Employee> getListEmloyee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = fileHelper.readF(PATH);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void displayEmloyee() {
        List<Employee> list = getListEmloyee();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)!=null){
                System.out.println(list.get(i));
            }
        }
    }

    @Override
    public void addEmloyee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.toString());
        fileHelper.writeF(PATH,stringList,true);
    }

    @Override
    public void editEmloyee(String id, List<Employee> employees) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            stringList.add(employees.get(i).toString());
        }
        fileHelper.writeF(PATH,stringList,false);
    }

    public static void main(String[] args) {
        EmployeeRepository em = new EmployeeRepository();
        em.displayEmloyee();
    }
}
