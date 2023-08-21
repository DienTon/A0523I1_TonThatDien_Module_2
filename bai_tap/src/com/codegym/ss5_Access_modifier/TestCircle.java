package com.codegym.ss5_Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
