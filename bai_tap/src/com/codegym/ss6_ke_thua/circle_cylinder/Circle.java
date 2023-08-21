package com.codegym.ss6_ke_thua.circle_cylinder;

public class Circle {
    private double banKinh;
    private String mauSac;

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public Circle() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    private double dienTich(){
        return this.getBanKinh()*this.getBanKinh() * 3.14;
    }

    @Override
    public String toString() {
        return  "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                ", dien tich hinh tron =" + dienTich() + ", ";
    }
}
