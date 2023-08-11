package com.codegym.ss3_array;

import java.util.Scanner;

public class TimSoLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap sl hang: ");
        int row = scanner.nextInt();
        System.out.print("nhap sl cot: ");
        int col = scanner.nextInt();

        int a[][] = new int[row][col];
        int max = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap phan tu thu [" + i +"][" + j + "]: ");
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

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("so lon nhat trong mang 2 chieu la : " + max);
    }
}
