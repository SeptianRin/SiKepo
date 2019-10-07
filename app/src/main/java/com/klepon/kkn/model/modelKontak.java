package com.klepon.kkn.model;

public class modelKontak {
    private String nomer;
    private String nama;
    private String telp;
    private String kewa;

    public modelKontak(String nomer, String nama, String telp, String kewa) {
        this.nomer = nomer;
        this.nama = nama;
        this.telp = telp;
        this.kewa = kewa;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getKewa() {
        return kewa;
    }

    public void setKewa(String kewa) {
        this.kewa = kewa;
    }
}
