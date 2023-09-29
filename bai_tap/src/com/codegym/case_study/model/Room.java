package com.codegym.case_study.model;

public class Room extends Facility{
    private String dvMienPhi;

    public Room() {
    }

    public Room(String dvMienPhi) {
        this.dvMienPhi = dvMienPhi;
    }

    public Room(String maDv, String tenDv, String kieuThue, int dienTichSuDung, int chiPhiThue, int slNguoiToiDa, String dvMienPhi) {
        super(maDv, tenDv, kieuThue, dienTichSuDung, chiPhiThue, slNguoiToiDa);
        this.dvMienPhi = dvMienPhi;
    }

    public String getDvMienPhi() {
        return dvMienPhi;
    }

    public void setDvMienPhi(String dvMienPhi) {
        this.dvMienPhi = dvMienPhi;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", dvMienPhi='" + dvMienPhi + '\'' +
                ", ";
    }
}
