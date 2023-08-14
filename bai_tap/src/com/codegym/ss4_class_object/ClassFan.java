package com.codegym.ss4_class_object;

public class ClassFan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        if (on == false) {
            return "color : " + this.color +
                    "; radius : " + this.radius +
                    ". fan is off";
        } else {
            return "speed: " + this.speed +
                    "; color : " + this.color +
                    "; radius : " + this.radius +
                    ". fan is on";
        }
    }

    public static void main(String[] args) {
        ClassFan fan = new ClassFan(3, true, 10, "yellow");
        ClassFan fan1 = new ClassFan(2, false, 5, "blue");

        System.out.println(fan + "\n");
        System.out.println(fan1);
    }
}
