package com.codegym.case_study.reprository;

import com.codegym.case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    void displayCustomer();
    void addCustomer(Customer customer);
    void editCustomer(String id, List<Customer> customers);
}
