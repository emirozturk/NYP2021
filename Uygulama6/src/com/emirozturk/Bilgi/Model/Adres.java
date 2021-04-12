package com.emirozturk.Bilgi.Model;

import com.emirozturk.Bilgi.Arayuzler.Okunabilir;

public class Adres implements Okunabilir {
    private String il;
    private String ilce;

    public Adres(String il,String ilce) {
        this.il = il;
        this.ilce = ilce;
    }

    @Override
    public String bilgiOku() {
        return "%s %s".formatted(il, ilce);
    }
}
