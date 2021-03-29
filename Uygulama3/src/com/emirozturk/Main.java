package com.emirozturk;

class Sinif{
    public int deger;
}

public class Main {
    public static void degerFonksiyonu(int deger){
        deger = 30948;
    }
    public static void referansFonksiyonu(Sinif nesne){
        nesne.deger = 30948;
    }
    public static void main(String[] args) {
        int degerTuru = 12837;
        degerFonksiyonu(degerTuru);
        System.out.println(degerTuru);

        Sinif referansTuru = new Sinif();
        referansTuru.deger = 12837;
        referansFonksiyonu(referansTuru);
        System.out.println(referansTuru.deger);
    }
}
