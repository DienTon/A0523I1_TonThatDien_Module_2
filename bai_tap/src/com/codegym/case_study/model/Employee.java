package com.codegym.case_study.model;

public class Employee extends Person {
    private String trinhDo, viTri, luong;


    public Employee() {
    }

    public Employee(String luong) {
        this.luong = luong;
    }

    public Employee(String id, String name, String ngaySinh, String email, boolean gioiTinh, int sdt, String trinhDo, String viTri, String luong) {
        super(id, name, ngaySinh, email, gioiTinh, sdt);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String id, String name, String ngaySinh, String email, boolean gioiTinh, int sdt, String luong) {
        super(id, name, ngaySinh, email, gioiTinh, sdt);
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() +
                trinhDo  +
                "," + viTri+
                "," + luong;
    }
}
//Trình độ : Trung cấp, Cao đẳng, Đại học và Sau đại học