package com.klepon.kkn.model;

public class modelKuliner {
    private String nomer;
    private String namaKuliner;
    private String tentangKuliner;

    public modelKuliner(String nomer, String namaKuliner, String tentangKuliner) {
        this.nomer = nomer;
        this.namaKuliner = namaKuliner;
        this.tentangKuliner = tentangKuliner;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNamaKuliner() {
        return namaKuliner;
    }

    public void setNamaKuliner(String namaKuliner) {
        this.namaKuliner = namaKuliner;
    }

    public String getTentangKuliner() {
        return tentangKuliner;
    }

    public void setTentangKuliner(String tentangKuliner) {
        this.tentangKuliner = tentangKuliner;
    }
}
