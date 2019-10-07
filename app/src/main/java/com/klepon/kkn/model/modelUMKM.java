package com.klepon.kkn.model;

public class modelUMKM {

    private String nomer;
    private String namaUmkm;
    private String tentangUmkm;

    public modelUMKM(String nomer, String namaUmkm, String tentangUmkm) {
        this.nomer = nomer;
        this.namaUmkm = namaUmkm;
        this.tentangUmkm = tentangUmkm;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNamaUmkm() {
        return namaUmkm;
    }

    public void setNamaUmkm(String namaUmkm) {
        this.namaUmkm = namaUmkm;
    }

    public String getTentangUmkm() {
        return tentangUmkm;
    }

    public void setTentangUmkm(String tentangUmkm) {
        this.tentangUmkm = tentangUmkm;
    }
}
