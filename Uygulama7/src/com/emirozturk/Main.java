package com.emirozturk;


public class Main {
    static void metot(Dortgen degisken){
        degisken.cevreHesapla();
    }

    public static void main(String[] args) {
        Dortgen dortgen = new Dortgen(3,7,8,18);
        System.out.println(dortgen.cevreHesapla());
        Dikdortgen dikdortgen = new Dikdortgen(5,1);
        System.out.println(dikdortgen.cevreHesapla());
        Dortgen kare = new Kare(7);
        System.out.println(kare.cevreHesapla());

   }
}
