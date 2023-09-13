package com.codegym.ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public boolean kiemTra(String st) {
        Stack<String> bStack = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '(') {
                bStack.push("(");
            } else if (ch == ')') {
                if (bStack.isEmpty()){
                    return false;
                }else{
                    bStack.pop();
                }
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        KiemTraDauNgoac kiemTraDauNgoac=new KiemTraDauNgoac();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bieu thuc can kiem tra: ");
        String st = sc.nextLine();
        if (kiemTraDauNgoac.kiemTra(st)){
            System.out.println("Well");
        }else{
            System.out.println("???");
        }

    }
}
