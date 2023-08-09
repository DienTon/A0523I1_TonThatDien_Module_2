package com.codegym.ss2_loop;

import java.util.Scanner;

public class HienThiLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //hcn
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n---------------------------------");
        //tam giac vuong;

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n---------------------------------");
        //tam giac vuong nguoc
        for (int i = 7; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
