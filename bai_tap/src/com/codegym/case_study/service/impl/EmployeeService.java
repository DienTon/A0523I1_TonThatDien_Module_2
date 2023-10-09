package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.person.Employee;
import com.codegym.case_study.reprository.impl.EmployeeRepository;
import com.codegym.case_study.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayEmloyee() {
        employeeRepository.displayEmloyee();
    }

    @Override
    public void addEmloyee() {
        Scanner sc = new Scanner(System.in);
        String id, name, ngaySinh, email, trinhDo, viTri, luong, gioiTinh;
        int sdt;
        System.out.println("---------- ADD NEW EMLOYEE ----------");
        System.out.print("Nhap id moi: ");
        id = sc.nextLine();
        while (isEmployeeCodeValid(id) != true) {
            System.out.print("id khong dung dinh dang NV-YYYY, vui long nhap lai: ");
            id = sc.nextLine();
        }
        System.out.print("Nhap ten moi: ");
        name = sc.nextLine();
        System.out.print("Nhap ngay sinh moi: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap email moi: ");
        email = sc.nextLine();
        System.out.print("Nhap Gioi Tinh moi: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap sdt moi: ");
        sdt = sc.nextInt();
        System.out.print("Nhap Vi tri moi: ");
        viTri = sc.nextLine();
        System.out.print("Nhap trinh do moi: ");
        trinhDo = sc.nextLine();
        System.out.print("Nhap luong moi: ");
        luong = sc.nextLine();
        Employee employee = new Employee(id, name, ngaySinh, email, gioiTinh, sdt, trinhDo, viTri, luong);
        employeeRepository.addEmloyee(employee);
        displayEmloyee();

    }


    @Override
    public void editEmloyee() {
        List<Employee> employees = employeeRepository.getListEmloyee();
        Scanner sc = new Scanner(System.in);
        String id;
        boolean flag;
        System.out.println("---------- EDIT EMLOYEE ----------");
        System.out.print("Nhap id can xoa: ");
        id = sc.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (id.equals(employees.get(i).getId())) {
                System.out.print("Nhap ten moi: ");
                employees.get(i).setName(sc.nextLine());
                System.out.print("Nhap ngay sinh moi: ");
                employees.get(i).setNgaySinh(sc.nextLine());
                System.out.print("Nhap email moi: ");
                employees.get(i).setEmail(sc.nextLine());
                System.out.print("Nhap Gioi Tinh moi: ");
                employees.get(i).setGioiTinh(sc.nextLine());
                do {
                    try {
                        flag = true;
                        System.out.print("Nhap sdt moi: ");
                        employees.get(i).setSdt(Integer.parseInt(sc.nextLine()));
                    } catch (NumberFormatException e) {
                        System.out.println("sdt khong hop le, vui long nhap lai!!");
                        flag = false;
                    }
                } while (flag == false);
                System.out.print("Nhap Vi tri moi: ");
                employees.get(i).setViTri(sc.nextLine());
                System.out.print("Nhap trinh do moi: ");
                employees.get(i).setTrinhDo(sc.nextLine());
                System.out.print("Nhap luong moi: ");
                employees.get(i).setLuong(sc.nextLine());
                employeeRepository.editEmloyee(id, employees);
                displayEmloyee();
                break;
            } else if (i == employees.size() - 1) {
                System.out.println("khong tim thay");
            }
        }
    }

    public static boolean isEmployeeCodeValid(String employeeCode) {
        if (employeeCode.length() != 7) {
            return false;
        }
        if (!employeeCode.startsWith("NV-")) {
            return false;
        }
        for (int i = 3; i < 7; i++) {
            char ch = employeeCode.charAt(i); //kiểm tra xem ký tự ch có phải là ký tự số hay không bằng cách
                                                // sử dụng phương thức Character.isDigit(ch). Nếu ch không phải là ký tự số, điều kiện trong if sẽ đúng.
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.addEmloyee();
    }
}
