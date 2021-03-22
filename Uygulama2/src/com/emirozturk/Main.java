package com.emirozturk;

public class Main {

    public static void main(String[] args) {
        Kisi yeniKisi = new Kisi("11111111111","Emir",1980,1);
        var ikinciKisi = new Kisi();
        System.out.println(yeniKisi); //yeniKisi.toString();
        System.out.println(yeniKisi.getYas());
        System.out.println(yeniKisi.getId());
    }
}
