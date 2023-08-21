package com.codegym.ss6_ke_thua.point2d_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D: " +
                "x=" + x +
                ", y=" + y +
                ", xy=" + "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point2D point = new Point2D(5,7);
        System.out.println(point.toString());
    }

}
