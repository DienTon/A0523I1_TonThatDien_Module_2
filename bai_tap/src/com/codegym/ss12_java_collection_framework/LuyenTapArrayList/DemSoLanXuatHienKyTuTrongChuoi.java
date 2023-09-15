package com.codegym.ss12_java_collection_framework.LuyenTapArrayList;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> testMap = new TreeMap<>();

        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        String[] newChuoi = chuoi.split("");


        for (String s : newChuoi){
            if (testMap.containsKey(s)){
                Integer value = testMap.get(s);
                value++;
                testMap.replace(s,value);
            }else {
                testMap.put(s,1);
            }
        }
        System.out.println(testMap);
    }
}
