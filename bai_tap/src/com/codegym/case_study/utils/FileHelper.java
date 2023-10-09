package com.codegym.case_study.utils;

import com.codegym.case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public List<String> readF(String pathFile) {
        List<String> stringList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    public  void writeF(String path, List<String> stringList, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFile(String path, List<Employee> employees) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < employees.size(); i++) {
            bufferedWriter.write(employees.get(i).toString());// Sử dụng phương thức toString của Employee hoặc định dạng chuỗi tùy ý
            bufferedWriter.newLine(); // Để xuống dòng sau mỗi phần tử
        }
        bufferedWriter.close();
    }
}
