package com.codegym.ss3_array;

import java.util.Scanner;

public class TimPhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap sl phan tu: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        NhapXuat.nhap(a,n);
        System.out.print("Mang sau khi nhap la: ");
        NhapXuat.xuat(a);

        int min = a[0];
        for (int i = 0; i < n; i++) {
            if(a[i] <= min){
                min = a[i];
            }
        }

        System.out.println("\nso nho nhat trong mang la: " + min);
    }
}
