package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.person.Customer;
import com.codegym.case_study.reprository.impl.CustomerRepository;
import com.codegym.case_study.service.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String regePhoneNumber = "^((\\(\\+84\\))|0)\\d{9}$";

    @Override
    public void displayCustomer() {
        customerRepository.displayCustomer();
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addCustomer() {
        String id, name, ngaySinh, email, trinhDo, loaiKhach, diaChi, gioiTinh,sdt;
        boolean flag = false;
        System.out.println("---------- ADD NEW CUSTOMER ----------");
        System.out.print("Nhap id moi: ");
        id = sc.nextLine();
//        while(isEmployeeCodeValid(id) != true){
//            System.out.print("id khong dung dinh dang NV-YYYY, vui long nhap lai: ");
//            id = sc.nextLine();
//        }
        System.out.print("Nhap ten moi: ");
        name = sc.nextLine();
        System.out.print("Nhap ngay sinh moi: ");
        ngaySinh = sc.nextLine();
        do {
            System.out.println("Nhap email moi");
            email = sc.nextLine();
            if (email.matches(EMAIL_REGEX)) {
                flag = true;
            } else {
                System.out.println("Email khong hop le");
                flag = false;
            }
        } while (flag == false);

        System.out.print("Nhap Gioi Tinh moi: ");
        gioiTinh = sc.nextLine();

        do {
            System.out.println("Nhap sdt moi");
            sdt = sc.nextLine();
            try {
                if (sdt.matches(regePhoneNumber)) {
                    flag = true;
                } else {
                    System.out.println("sdt khong hop le");
                    flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("sdt khong hop le, vui long nhap lai!!");
                flag = false;
            }
        } while (flag == false);
        System.out.print("Nhap loai khach moi: ");
        loaiKhach = sc.nextLine();
        System.out.print("Nhap dia chi moi: ");
        diaChi = sc.nextLine();
        Customer customer = new Customer(id, name, ngaySinh, email, gioiTinh, Integer.parseInt(sdt), loaiKhach, diaChi);
        customerRepository.addCustomer(customer);
        displayCustomer();
    }

    @Override
    public void editCustomer() {
        System.out.println("---------- EDIT CUSTOMER ----------");
        List<Customer> customerList = customerRepository.getlistCustomer();
        String id, email;
        int sdt;
        boolean flag;
        System.out.print("Nhap id can edit: ");
        id = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                System.out.print("Nhap ten moi: ");
                customerList.get(i).setName(sc.nextLine());

                System.out.print("Nhap ngay sinh moi: ");
                customerList.get(i).setNgaySinh(sc.nextLine());

                do {
                    System.out.println("Nhap email moi");
                    email = sc.nextLine();
                    if (email.matches(EMAIL_REGEX)) {
                        customerList.get(i).setEmail(email);
                        flag = true;
                    } else {
                        System.out.println("Email khong hop le");
                        flag = false;
                    }
                } while (flag == false);

                System.out.print("Nhap Gioi Tinh moi: ");
                customerList.get(i).setGioiTinh(sc.nextLine());

                do {
                    try {
                        System.out.println("Nhap sdt moi");
                        sdt = sc.nextInt();
                        if (String.valueOf(sdt).matches(regePhoneNumber)) {
                            flag = true;
                            customerList.get(i).setSdt(sdt);
                        } else {
                            System.out.println("sdt khong hop le");
                            flag = false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("sdt khong hop le, vui long nhap lai!!");
                        flag = false;
                    }
                } while (flag == false);

                System.out.print("Nhap loai khach moi: ");
                customerList.get(i).setLoaiKhach(sc.nextLine());

                System.out.print("Nhap dia chi moi: ");
                customerList.get(i).setDiaChi(sc.nextLine());

                customerRepository.editCustomer(id, customerList);
                displayCustomer();
                break;
            } else if (i == customerList.size() - 1) {
                System.out.println("id khong tim thay");
            }
        }
    }

    public static void main(String[] args) {
        CustomerService c = new CustomerService();
        c.editCustomer();
    }
}
