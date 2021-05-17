package com.emirozturk;

public class Dortgen {
    protected int birinciKenar;
    protected int ikinciKenar;
    protected int ucuncuKenar;
    protected int dorduncuKenar;

    public Dortgen(int birinciKenar,int ikinciKenar,int ucuncuKenar,int dorduncuKenar){
        this.birinciKenar = birinciKenar;
        this.ikinciKenar = ikinciKenar;
        this.ucuncuKenar = ucuncuKenar;
        this.dorduncuKenar = dorduncuKenar;
    }
    public int cevreHesapla(){
        return birinciKenar+ikinciKenar+ucuncuKenar+dorduncuKenar;
    }
}
