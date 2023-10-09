package com.codegym.case_study.model.person;

import com.codegym.case_study.model.person.Person;

public class Customer extends Person {
    private String loaiKhach,diaChi;

    public Customer() {
    }

    public Customer(String loaiKhach, String diaChi) {
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String id, String name, String ngaySinh, String email, String gioiTinh, int sdt, String loaiKhach, String diaChi) {
        super(id, name, ngaySinh, email, gioiTinh, sdt);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return super.toString() +
                loaiKhach +
                "," + diaChi
                ;
    }
}
