package com.emirozturk;

public class Dikdortgen extends Dortgen{
    public Dikdortgen(int uzunKenar,int kisaKenar){
        super(uzunKenar,uzunKenar,kisaKenar,kisaKenar);
    }

    public int cevreHesapla() {
        System.out.print("Dikdortgen");
        return birinciKenar+ikinciKenar+ucuncuKenar+dorduncuKenar;
    }
}
