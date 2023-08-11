package com.codegym.ss3_array;

import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap sl phan tu");
        int n = scanner.nextInt();
        int[] a=new int[n];
        nhap(a,n);
        xuat(a);
    }

    public static void nhap(int a[], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap pt " + i + ": ");
            a[i] = scanner.nextInt();
        }
    }

    public static void xuat(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
