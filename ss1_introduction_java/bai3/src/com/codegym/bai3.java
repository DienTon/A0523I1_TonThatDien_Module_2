package com.codegym;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("Nhap USD: ");
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        int USD = Integer.parseInt(scanner.nextLine());
        int VND = USD * rate;

        System.out.println(USD + "$ = " + VND + "d");

    }
}
