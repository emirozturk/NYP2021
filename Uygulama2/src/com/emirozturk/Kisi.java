package com.emirozturk;

import java.time.LocalDateTime;

public class Kisi {
    private int id;
    private String kimlikNo;
    private String ad;
    private int dogumYili;

    public Kisi(){

    }
    public Kisi(String KimlikNo,String Ad,int DogumYili,int Id){
        kimlikNo = KimlikNo;
        ad = Ad;
        dogumYili = DogumYili;
        id = Id;
    }
    public int getId(){
        return id;
    }
    public void setKimlikNo(String KimlikNo){
        kimlikNo = KimlikNo;
    }
    public String getKimlikNo(){
        return kimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String Ad) {
        ad = Ad;
    }

    public int getDogumYili() {
        return dogumYili;
    }
    public int getYas(){
        return Integer.parseInt(String.valueOf(LocalDateTime.now().getYear()))-dogumYili;
    }

    public void setDogumYili(int DogumYili) {
        dogumYili = DogumYili;
    }

    public String toString(){
        return kimlikNo + " " + ad + " " + dogumYili;
    }
}
