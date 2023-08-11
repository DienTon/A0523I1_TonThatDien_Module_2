package com.codegym.ss3_array;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap sl phan tu mang 1");
        int n1 = scanner.nextInt();
        System.out.print("nhap sl phan tu mang 2");
        int n2 = scanner.nextInt();
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        int[] a3 = new int[n1 + n2];

        System.out.println("Nhap gia tri phan tu cho mang 1");
        NhapXuat.nhap(a1, n1);
        System.out.println("Nhap gia tri phan tu cho mang 2");
        NhapXuat.nhap(a2, n2);

        System.out.print("\nmang 1 :" ); NhapXuat.xuat(a1);
        System.out.print("\nmang 2 :" ); NhapXuat.xuat(a2);

        for (int i = 0; i < n1; i++) {
            a3[i] = a1[i];
        }
        for (int i = 0; i < n2; i++) {
            a3[n1+i] = a2[i];
        }

        System.out.print("\nMang 3 sau khi gop : "); NhapXuat.xuat(a3);

    }
}
