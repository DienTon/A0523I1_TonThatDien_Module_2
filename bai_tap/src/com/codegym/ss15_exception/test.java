package com.codegym.ss15_exception;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkTriangle check= new checkTriangle() ;
        int a,b,c;
        try {
            System.out.println("Nhap canh a :");
            a= scanner.nextInt();
            System.out.println("Nhap canh b :");
            b= scanner.nextInt();
            System.out.println("Nhap canh c :");
            c= scanner.nextInt();
            try{
                check.checkTriangle(a,b,c);
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println("Khong dung dinh dang.");
        }
    }
}
