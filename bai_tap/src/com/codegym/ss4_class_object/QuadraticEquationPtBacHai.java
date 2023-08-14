package com.codegym.ss4_class_object;

import java.util.Scanner;

public class QuadraticEquationPtBacHai {
    double a,b,c;

    public QuadraticEquationPtBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta =this.b*2 - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-this.b+Math.pow(this.b*this.b-4*this.a*this.c,0.5))/(2*this.a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-this.b-Math.pow(this.b*this.b-4*this.a*this.c,0.5))/(2*this.a);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Nhap a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        c = scanner.nextDouble();
        QuadraticEquationPtBacHai ptBacHai = new QuadraticEquationPtBacHai(a,b,c);
        if( ptBacHai.getDiscriminant() > 0 ){
            System.out.println("pt co 2 nghiem : " + ptBacHai.getRoot1() + " , " + ptBacHai.getRoot2());
        } else if ( ptBacHai.getDiscriminant() == 0) {
            System.out.println("pt co 1 nghiem (do 2 nghiem bang nhau) : " + ptBacHai.getRoot1());
        }else{
            System.out.println("pt vo nghiem");
        }
    }
}
