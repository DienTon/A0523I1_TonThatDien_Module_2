package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.Employee;
import com.codegym.case_study.reprository.impl.EmployeeRepository;
import com.codegym.case_study.service.IEmployeeService;

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
        String id, name, ngaySinh, email, trinhDo, viTri, luong;
        boolean gioiTinh;
        int sdt;
        System.out.println("---------- ADD NEW EMLOYEE ----------");
            System.out.print("Nhap id moi: "); id = sc.next();
        while(isEmployeeCodeValid(id) != true){
            System.out.print("id khong dung dinh dang NV-YYYY, vui long nhap lai: ");
            id = sc.next();
        }
        System.out.print("Nhap ten moi: "); name = sc.next();
        System.out.print("Nhap ngay sinh moi: "); ngaySinh = sc.next();
        System.out.print("Nhap email moi: "); email = sc.next();
        System.out.print("Nhap Gioi Tinh moi: "); gioiTinh = sc.nextBoolean();
        System.out.print("Nhap sdt moi: "); sdt = sc.nextInt();
        System.out.print("Nhap Vi tri moi: "); viTri = sc.next();
        System.out.print("Nhap trinh do moi: "); trinhDo = sc.next();
        System.out.print("Nhap luong moi: "); luong = sc.next();
        Employee employee = new Employee(id,name,ngaySinh,email,gioiTinh,sdt,viTri,trinhDo,luong);
        employeeRepository.addEmloyee(employee);
        displayEmloyee();

    }


    @Override
    public void editEmloyee() {
        Scanner sc = new Scanner(System.in);
        String id, name, ngaySinh, email, trinhDo, viTri, luong;
        boolean gioiTinh;
        int sdt;
        System.out.println("---------- ADD NEW EMLOYEE ----------");
        System.out.print("Nhap id moi: "); id = sc.next();
        while(isEmployeeCodeValid(id) != true){
            System.out.print("id khong dung dinh dang NV-YYYY, vui long nhap lai: ");
            id = sc.next();
        }
        System.out.print("Nhap ten moi: "); name = sc.next();
        System.out.print("Nhap ngay sinh moi: "); ngaySinh = sc.next();
        System.out.print("Nhap email moi: "); email = sc.next();
        System.out.print("Nhap Gioi Tinh moi: "); gioiTinh = sc.nextBoolean();
        System.out.print("Nhap sdt moi: "); sdt = sc.nextInt();
        System.out.print("Nhap Vi tri moi: "); viTri = sc.next();
        System.out.print("Nhap trinh do moi: "); trinhDo = sc.next();
        System.out.print("Nhap luong moi: "); luong = sc.next();
        Employee employee = new Employee(id,name,ngaySinh,email,gioiTinh,sdt,viTri,trinhDo,luong);
        employeeRepository.editEmloyee(id, employee);
        displayEmloyee();
    }

    public static boolean isEmployeeCodeValid(String employeeCode) {
        // Kiểm tra xem chuỗi có độ dài là 8 ký tự không
        if (employeeCode.length() != 7) {
            return false;
        }

        // Kiểm tra xem chuỗi bắt đầu bằng "NV-"
        if (!employeeCode.startsWith("NV-")) {
            return false;
        }

        // Kiểm tra xem 4 ký tự sau "NV-" có phải là số không
        for (int i = 3; i < 7; i++) {
            char ch = employeeCode.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        // Nếu tất cả các điều kiện đều đúng, mã nhân viên hợp lệ
        return true;
    }

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.addEmloyee();
    }
}
