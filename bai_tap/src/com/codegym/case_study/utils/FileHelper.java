package com.codegym.case_study.utils;

import com.codegym.case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHelper {
    Scanner scanner = new Scanner(System.in);

    public List<Employee> readFile(String path) {
        List<Employee> employees = new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] attributes = line.split(",");
//                    String id, name, ngaySinh, email, trinhDo, viTri, luong;
//                    boolean gioiTinh;
//                    int sdt;
//                     id = attributes[0];
//                    name = attributes[1];
//                    ngaySinh = attributes[2];
//                    email = attributes[3];

//                    gioiTinh = Boolean.parseBoolean(attributes[4]);
//                    sdt = Integer.parseInt(attributes[5]);
//                    viTri = attributes[6];
//                    trinhDo = attributes[7];
//                    luong = attributes[8];
//                    employees.add(new Employee(id,name,ngaySinh,email,gioiTinh,sdt,trinhDo,viTri,luong));
                    Employee employee = new Employee();
                    employee.setId(attributes[0]);
                    employee.setName(attributes[1]);
                    employee.setNgaySinh(attributes[2]);
                    employee.setEmail(attributes[3]);
                    employee.setGioiTinh(Boolean.parseBoolean(attributes[4]));
                    employee.setSdt(Integer.parseInt(attributes[5]));
                    employee.setViTri(attributes[7]);
                    employee.setTrinhDo(attributes[6]);
                    employee.setLuong(attributes[8]);
                    employees.add(employee);
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("file khong ton tai");
        } catch (Exception e) {
            e.getMessage();
        }
        return employees;
    }
    public void writeFile(String path,List<Employee> employees) throws IOException {
        FileWriter fileWriter=new FileWriter(path);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (int i = 0; i < employees.size(); i++) {
            bufferedWriter.write(employees.get(i).toString());// Sử dụng phương thức toString của Employee hoặc định dạng chuỗi tùy ý
            bufferedWriter.newLine(); // Để xuống dòng sau mỗi phần tử
        }
        bufferedWriter.close();
    }
}
