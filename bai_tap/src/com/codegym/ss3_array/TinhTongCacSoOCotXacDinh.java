package com.codegym.ss3_array;

import java.util.Scanner;

public class TinhTongCacSoOCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap sl hang: ");
        int row = scanner.nextInt();
        System.out.print("nhap sl cot: ");
        int col = scanner.nextInt();

        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap phan tu thu [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mang 2 chieu sau khi nhap: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Nhap cot can tinh tong");
        int colSum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += a[i][colSum];
        }
        System.out.println("Tong cac so trong cot " + colSum + " = " + sum);
    }
}
