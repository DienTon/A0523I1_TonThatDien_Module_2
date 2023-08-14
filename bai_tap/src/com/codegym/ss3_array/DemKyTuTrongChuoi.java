package com.codegym.ss3_array;

import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "asdjqlkwjdweqwe" ;
        System.out.print("Nhap ky tu tu ba phim : ");
        char inputStr = scanner.next().charAt(0);
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if ( inputStr == str.charAt(i)){
                count ++ ;
            }
        }
        System.out.println("So lan xuat hien cua ky tu "+inputStr+" la :"+count);
    }
}
