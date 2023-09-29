package com.codegym.case_study.model;

public class Contract {
    private String maBooking,tienCocTruoc;
    private int soHopDong,tongTien;

    public Contract(String maBooking, String tienCocTruoc, int soHopDong, int tongTien) {
        this.maBooking = maBooking;
        this.tienCocTruoc = tienCocTruoc;
        this.soHopDong = soHopDong;
        this.tongTien = tongTien;
    }

    public Contract() {
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getTienCocTruoc() {
        return tienCocTruoc;
    }

    public void setTienCocTruoc(String tienCocTruoc) {
        this.tienCocTruoc = tienCocTruoc;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "maBooking='" + maBooking + '\'' +
                ", tienCocTruoc='" + tienCocTruoc + '\'' +
                ", soHopDong=" + soHopDong +
                ", tongTien=" + tongTien +
                '}';
    }
}
