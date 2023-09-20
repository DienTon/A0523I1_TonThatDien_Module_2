package com.codegym.ss14_thuat_toan_sap_xep;

import java.util.Arrays;

public class CaiDatThuatToanSapXepChen {
    public void insertionSort(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        CaiDatThuatToanSapXepChen sapXepChen = new CaiDatThuatToanSapXepChen();
        int[] list = {5,4,7,2,3,1};
        System.out.println(Arrays.toString(list));
        sapXepChen.insertionSort(list);
        System.out.println("----------sap xep-----------");
        System.out.println(Arrays.toString(list));

    }
}
