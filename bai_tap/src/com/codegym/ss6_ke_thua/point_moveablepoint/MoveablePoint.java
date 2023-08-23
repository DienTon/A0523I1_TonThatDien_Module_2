package com.codegym.ss6_ke_thua.point_moveablepoint;

import com.codegym.ss6_ke_thua.point2d_point3d.Point2D;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] xyS = new float[2];
        xyS[0] = xSpeed;
        xyS[1] = ySpeed;
        return xyS;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public MoveablePoint move(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString()+", speed= {" +
                 + xSpeed +", "+
                 + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2,5,6,7);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
