package com.codegym.ss13_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanSuDungDeQuy {
    public int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        } else if (value < array[middle]) {
             return binarySearch(array, 1, middle - 1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        ThuatToanSuDungDeQuy thuatToanSuDungDeQuy = new ThuatToanSuDungDeQuy();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap sl phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap pt thu" + i + " : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int value = sc.nextInt();
        int result = thuatToanSuDungDeQuy.binarySearch(arr,0,n-1,value);
        if(result == -1){
            System.out.println("khong tim thay");
        }else{
            System.out.println("so can tim nam o vi tri: " + (result + 1) +" trong mang");
        }

    }
}
