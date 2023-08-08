package com.codegym;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                }
            }
            if(flag) System.out.println(i);
        }
    }
}
