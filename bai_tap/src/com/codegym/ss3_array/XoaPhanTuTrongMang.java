package com.codegym.ss3_array;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap sl phan tu: ");
        int n = scanner.nextInt();
        int a[] = new int[n];

        NhapXuat.nhap(a, n);
        System.out.print("mang vua nhap: ");
        NhapXuat.xuat(a);

        System.out.print("\nnhap phan tu can xoa: ");
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                int index_del = i;
                System.out.println("vi tri phan tu can xoa la: " + index_del);
                for (int j = index_del; j < n-1; j++) {
                    a[j]=a[j + 1];
                }
                a[a.length-1] = 0;
            }
        }
        System.out.print("mang sau khi xoa la: ");
        NhapXuat.xuat(a);
    }
}

