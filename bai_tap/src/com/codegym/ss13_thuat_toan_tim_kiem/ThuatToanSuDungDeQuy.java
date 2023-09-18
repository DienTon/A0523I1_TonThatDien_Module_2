package com.codegym.ss13_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanSuDungDeQuy {
    public int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            binarySearch(array, middle + 1, right, value);
        } else if (value < array[middle]) {
            binarySearch(array, left, middle - 1, value);
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

    }
}
