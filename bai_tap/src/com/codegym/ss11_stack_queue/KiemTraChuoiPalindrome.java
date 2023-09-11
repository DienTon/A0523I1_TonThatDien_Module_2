package com.codegym.ss11_stack_queue;

import java.util.*;

public class KiemTraChuoiPalindrome {
    public boolean kiemTraChuoi(String st){
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            stringStack.push(String.valueOf(ch[i]));
            stringQueue.add(String.valueOf(ch[i]));
        }
        while (!stringStack.isEmpty()){
            if (!stringStack.pop().equals(stringQueue.remove())){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        KiemTraChuoiPalindrome kiemTraChuoiPalindrome = new KiemTraChuoiPalindrome();
        System.out.print("nhap chuoi can kiem tra: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().toLowerCase();
        if(kiemTraChuoiPalindrome.kiemTraChuoi(st)){
            System.out.println(" la chuoi Palindrome");
        }else{
            System.out.println(" khong phai la chuoi Palindrome");
        }
    }
}
