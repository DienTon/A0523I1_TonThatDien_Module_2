package com.codegym.ss3_array;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap sl phan tu: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        NhapXuat.nhap(a, n);
        System.out.print("Mang sau khi nhap la: ");
        NhapXuat.xuat(a);

        System.out.print("\nNhap so can chen: ");
        int x = scanner.nextInt();

        System.out.print("Nhap vi tri can chen: ");
        int index = scanner.nextInt();
        while (index < 0 ||index >= n){
            System.out.println("vi tri chen khong hop le, khong the chen vao mang");
            index = scanner.nextInt();
        }

        int[] newA = new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            newA[i] = a[i];
        }
        for (int i = newA.length-1; i > index; i--) {
            newA[i] = newA[i-1];
        }
        newA[index] = x;

        System.out.print("mang sau khi chen " + x + " la: " );
        NhapXuat.xuat(newA);

    }
}
