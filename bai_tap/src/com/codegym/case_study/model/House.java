package com.codegym.case_study.model;

public class House extends Facility {
    private String tieuChuan;
    private int soTang;

    public House() {
    }

    public House(String tieuChuan, int soTang) {
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }

    public House(String maDv, String tenDv, String kieuThue, int dienTichSuDung, int chiPhiThue, int slNguoiToiDa, String tieuChuan, int soTang) {
        super(maDv, tenDv, kieuThue, dienTichSuDung, chiPhiThue, slNguoiToiDa);
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tieuChuan='" + tieuChuan + '\'' +
                ", soTang=" + soTang + ", ";
    }
}
