package com.codegym.ss16_io_text_file;

import com.codegym.ss12_java_collection_framework.LuyenTapArrayList.service.ProductService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocFileCsv {

    public List<String> readFile(String path){
        List<String> list = new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                if (!line.trim().isEmpty()){
                    list.add(line+"\n");
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        DocFileCsv test = new DocFileCsv();
        ProductService productService = new ProductService();
        String file = "D:\\CodeGym\\A0523I1-TonThatDien\\Module2\\bai_tap\\src\\com\\codegym\\ss16_io_text_file\\country.csv";
        System.out.println(test.readFile(file));

        }
    }

