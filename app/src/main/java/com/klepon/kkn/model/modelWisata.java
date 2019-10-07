package com.klepon.kkn.model;

public class modelWisata {

    private String nomer;
    private String namaWisata;
    private String tentangWisata;

    public String getNomer() {
        return nomer;
    }

    public modelWisata(String nomer, String namaWisata, String tentangWisata) {
        this.nomer = nomer;
        this.namaWisata = namaWisata;
        this.tentangWisata = tentangWisata;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNamaWisata() {
        return namaWisata;
    }

    public void setNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }

    public String getTentangWisata() {
        return tentangWisata;
    }

    public void setTentangWisata(String tentangWisata) {
        this.tentangWisata = tentangWisata;
    }
}
