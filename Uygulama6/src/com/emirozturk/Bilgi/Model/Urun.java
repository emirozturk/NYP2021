package com.emirozturk.Bilgi.Model;

import com.emirozturk.Bilgi.Arayuzler.Okunabilir;

public class Urun implements Okunabilir {
    private String barkod;

    public Urun(String barkod) {
        this.barkod = barkod;
    }

    @Override
    public String bilgiOku() {
        return barkod;
    }
}
