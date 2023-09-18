package com.codegym.ss14_thuat_toan_sap_xep;

import com.codegym.ss3_array.NhapXuat;

public class MinhHoaSapXepChen {
    public void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
    public void xuatMang(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        MinhHoaSapXepChen xepChen = new MinhHoaSapXepChen();
        int[] arr = {1,5,2,7,9,100};
        xepChen.insertionSort(arr);
        xepChen.xuatMang(arr);
    }
}
