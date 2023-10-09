package com.codegym.case_study.reprository.impl;

import com.codegym.case_study.model.person.Customer;
import com.codegym.case_study.reprository.ICustomerRepository;
import com.codegym.case_study.utils.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH_CUSTOMER = "D:\\CodeGym\\A0523I1-TonThatDien\\Module2\\bai_tap\\src\\com\\codegym\\case_study\\data\\customer.csv";
    FileHelper fileHelper = new FileHelper();

    public List<Customer> getlistCustomer() {
        List<String> stringList = fileHelper.readF(PATH_CUSTOMER);
        List<Customer> customerList = new ArrayList<>();
        String[] arr = null;
        try {
            for (String string : stringList) {
                arr = string.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], Integer.parseInt(arr[5]), arr[6], arr[7]);
                customerList.add(customer);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("File khong co thong tin");
        }
//        for (int i = 0; i < stringList.size(); i++) {
//            arr = stringList.get(i).split(",");
//            if(arr.length == 8){
//                Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]),arr[6],arr[7]);
//                customerList.add(customer);
//            }
//        }
        return customerList;
    }

    @Override
    public void displayCustomer() {
        List<Customer> customerList = getlistCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i) != null) {
                System.out.println(customerList.get(i));
            }
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.toString());
        fileHelper.writeF(PATH_CUSTOMER,stringList,true);
    }


    @Override
    public void editCustomer(String id, List<Customer> customers) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            stringList.add(customers.get(i).toString());
        }
        fileHelper.writeF(PATH_CUSTOMER, stringList, false);
    }

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.displayCustomer();
    }
}
