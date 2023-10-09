package com.codegym.case_study.model.person;

public class Person {
    private String id, name, ngaySinh, email,gioiTinh;
    private int sdt;

    public Person() {
    }

    public Person(String id, String name, String ngaySinh, String email, String gioiTinh, int sdt) {
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return id +
                "," + name +
                "," + ngaySinh +
                "," + email +
                "," + gioiTinh +
                "," + sdt +
                ",";
    }
}
