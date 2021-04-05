package com.emirozturk;

import java.util.List;

public class Kisi {
    private String adSoyad;
    private int dogumYili;
    private Adres adres;
    private Kart kart;

    public Kisi(String adSoyad, int dogumYili, Adres adres, Kart kart) {
        this.adSoyad = adSoyad;
        this.dogumYili = dogumYili;
        this.adres = adres;
        this.kart = kart;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public Adres getAdres() {
        return adres;
    }

    public Kart getKart() {
        return kart;
    }

    public String toString() {
        return "adSoyad:'%s', dogumYili:%d, adres:%s, kart:%s".formatted(adSoyad, dogumYili, adres, kart.yazdir());
    }
}
