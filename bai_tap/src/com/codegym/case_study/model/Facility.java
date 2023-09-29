package com.codegym.case_study.model;

public class Facility {
    private String maDv, tenDv, kieuThue;
    private int dienTichSuDung, chiPhiThue, slNguoiToiDa;

    public Facility() {
    }

    public Facility(String maDv, String tenDv, String kieuThue, int dienTichSuDung, int chiPhiThue, int slNguoiToiDa) {
        this.maDv = maDv;
        this.tenDv = tenDv;
        this.kieuThue = kieuThue;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.slNguoiToiDa = slNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public String getTenDv() {
        return tenDv;
    }

    public void setTenDv(String tenDv) {
        this.tenDv = tenDv;
    }

    public int getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(int dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSlNguoiToiDa() {
        return slNguoiToiDa;
    }

    public void setSlNguoiToiDa(int slNguoiToiDa) {
        this.slNguoiToiDa = slNguoiToiDa;
    }

    @Override
    public String toString() {
        return "maDv='" + maDv + '\'' +
                ", tenDv='" + tenDv + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", slNguoiToiDa=" + slNguoiToiDa;
    }
}
