package com.codegym.ss5_Access_modifier;

public class testStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Diễn");
        student.setClasses("A05");
        System.out.println(student.toString());
    }
}
