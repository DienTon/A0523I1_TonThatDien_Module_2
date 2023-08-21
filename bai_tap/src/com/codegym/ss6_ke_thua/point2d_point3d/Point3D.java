package com.codegym.ss6_ke_thua.point2d_point3d;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] xyz = new float[3];
        xyz[0] = super.getX();
        xyz[1] = super.getY();
        xyz[2] = this.getZ();
        return xyz;
    }

    @Override
    public String toString() {
        return " xyz=" + "(" + super.getX() + ", " + super.getY() +  ", " + this.getZ() +")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(3,4,5);
        System.out.println(point3D.toString());
    }
}
