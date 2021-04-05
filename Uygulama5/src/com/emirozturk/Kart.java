package com.emirozturk;

public class Kart {
    private String kartNo;
    private byte ay;
    private byte yil;
    private byte cvc2;

    public Kart(String kartNo,byte ay,byte yil,byte cvc2){
        this.kartNo = kartNo;
        this.ay = ay;
        this.yil = yil;
        this.cvc2 = cvc2;
    }
    public String yazdir(){
        return "%s %d %d %d".formatted(kartNo,ay,yil,cvc2);
    }
}
