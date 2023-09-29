package com.codegym.ss15_exception;

public class checkTriangle {
    public void checkTriangle( int a, int b, int c) throws Exception{
        if( a+b<=c||a + c <= b || b + c <= a){
            throw new IllegalTriangleException("Loi: Tam giac khong hop le.");
        }else {
            System.out.println("Tam giac hop le.");
        }

    }
}
