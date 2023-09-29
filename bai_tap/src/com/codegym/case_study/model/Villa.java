package com.codegym.case_study.model;

public class Villa extends Facility{
    private String tieuChuan;
    private int dienTichHoBoi, soTang;

    public Villa() {
    }

    public Villa(String tieuChuan, int dienTichHoBoi, int soTang) {
        this.tieuChuan = tieuChuan;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String maDv, String tenDv, String kieuThue, int dienTichSuDung, int chiPhiThue, int slNguoiToiDa, String tieuChuan, int dienTichHoBoi, int soTang) {
        super(maDv, tenDv, kieuThue, dienTichSuDung, chiPhiThue, slNguoiToiDa);
        this.tieuChuan = tieuChuan;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+
                "tieuChuan='" + tieuChuan + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang+ ", ";
    }
}
