package com.codegym.ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thap phan can chuyen: ");
        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        System.out.print(" => ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
