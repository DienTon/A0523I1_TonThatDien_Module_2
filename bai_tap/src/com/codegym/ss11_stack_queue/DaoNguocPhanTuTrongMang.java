package com.codegym.ss11_stack_queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        int n;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap sl pt: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("nhap pt thu " + i + ": ");
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("mang sau khi dao nguoc: " + Arrays.toString(arr));
    }
}
