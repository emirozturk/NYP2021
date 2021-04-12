package com.emirozturk.Bilgi.Model;

import com.emirozturk.Bilgi.Arayuzler.Okunabilir;
import com.emirozturk.Bilgi.Arayuzler.Yazilabilir;

public class Kisi implements Okunabilir, Yazilabilir {
    private String adSoyad;

    public Kisi(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String bilgiOku() {
        return adSoyad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    @Override
    public void dosyayaYaz() {
        System.out.println("Dosyaya yazıldı");
    }
}
