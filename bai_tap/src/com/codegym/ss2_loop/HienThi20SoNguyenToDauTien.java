package com.codegym.ss2_loop;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int temp = 0;

        while (count <= 20) {
            boolean flag = true;
            if (temp >= 2) {
                for (int i = 2; i < temp; i++) {
                    if (temp % i == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(temp);
                    count++;
                }
            }
            temp++;
        }

    }
}
