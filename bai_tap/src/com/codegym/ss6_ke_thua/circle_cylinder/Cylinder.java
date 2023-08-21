package com.codegym.ss6_ke_thua.circle_cylinder;

public class Cylinder extends Circle{
    private double chieuCao;

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Cylinder(double banKinh, String mauSac, double chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double theTich(){
        return 3.14*super.getBanKinh()*super.getBanKinh()*this.getChieuCao();
    }

    @Override
    public String toString() {
        return "Cylinder : " + super.toString() +
                "chieuCao=" + chieuCao +
                " the tich hinh tru = " + theTich();
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder(5,"red", 2);
        Circle t = new Circle(7,"blue");
        System.out.println(c.toString());
        System.out.println("Circle : "+t.toString());
    }
}
