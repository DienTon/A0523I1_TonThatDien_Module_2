package com.codegym.ss16_io_text_file;

import com.codegym.ss12_java_collection_framework.LuyenTapArrayList.service.ProductService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDoc {
    public void displayProduct(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                System.out.println(list.get(i));
            }
        }
    }
    public List<String> readFile(String path){
        List<String> list = new ArrayList<>();

        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
//                String[] row = line.split(",");
//                for (String index: row) {
//                    System.out.printf("%-10s",index);
//                }
//                System.out.println();
                if (!line.trim().isEmpty()){
                    list.add(line);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        TestDoc test = new TestDoc();
        ProductService productService = new ProductService();
        String file = "src/com/codegym/ss16_io_text_file/testFile.csv";
//        System.out.println(test.readFile(file));
        test.displayProduct(test.readFile(file));

        }
    }

