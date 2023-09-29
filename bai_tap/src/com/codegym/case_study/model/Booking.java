package com.codegym.case_study.model;

public class Booking {
    private String maBooking, ngayBooking, ngayBatDau, ngayKetThuc, maKhachHang, maDv;

    public Booking(String maBooking, String ngayBooking, String ngayBatDau, String ngayKetThuc, String maKhachHang, String maDv) {
        this.maBooking = maBooking;
        this.ngayBooking = ngayBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.maDv = maDv;
    }

}
