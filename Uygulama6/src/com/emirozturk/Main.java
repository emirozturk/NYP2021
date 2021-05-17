package com.emirozturk;

import com.emirozturk.Bilgi.Arayuzler.Okunabilir;
import com.emirozturk.Bilgi.Arayuzler.Yazilabilir;
import com.emirozturk.Bilgi.Model.*;

public class Main {
    public static void bilgiGoster(Okunabilir nesne){
        var bilgi = nesne.bilgiOku();
        System.out.println(bilgi);
    }
    public static void ciktiAl(Yazilabilir yazilabilirNesne){
        yazilabilirNesne.dosyayaYaz();
    }
    /*
    public static void bilgiGoster(Kisi kisi){
        var bilgi = kisi.bilgiOku();
        System.out.println(bilgi);
    }
    public static void bilgiGoster(Urun urun){
        var bilgi = urun.bilgiOku();
        System.out.println(bilgi);
    }
    public static void bilgiGoster(Adres adres){
        var bilgi = adres.bilgiOku();
        System.out.println(bilgi);
    }
    */
    public static void main(String[] args) {
        Kisi yeniKisi = new Kisi("Emir Öztürk");
        Urun yeniUrun = new Urun("2389478329");
        Adres yeniAdres = new Adres("İstanbul","Kadıköy");
        bilgiGoster(yeniKisi);
        bilgiGoster(yeniUrun);
        bilgiGoster(yeniAdres);
        ciktiAl(yeniKisi);

        yeniKisi.getAdSoyad(); //Getter çağırılabiliyor.
        Okunabilir kisi2 = new Kisi("Ad soyad 1");
        Yazilabilir kisi3 = new Kisi("Ad soyad 2");
        //((Kisi)kisi2).getAdSoyad();
        //kisi2.dosyayYaz();
    }
}
