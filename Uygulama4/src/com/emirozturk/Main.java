package com.emirozturk;

public class Main {

    public static void main(String[] args) {
        var baslangic = System.nanoTime();
        //Kuyruk yeniKuyruk = new Kuyruk();
        var yeniKuyruk = new Kuyruk();
        yeniKuyruk.ekle(5);
        yeniKuyruk.ekle(10);
        yeniKuyruk.ekle(23);
        int deger1 = yeniKuyruk.sil();
        int deger2 = yeniKuyruk.sil();
        System.out.println("Deger1:"+deger1);
        System.out.println("Deger2:"+deger2);
        int deger = yeniKuyruk.sil();
        System.out.println("Deger3:"+deger);
        deger = yeniKuyruk.sil();
        if(deger!=-1)
            System.out.println(deger);
        else
            System.out.println("Kuyruk boş");
        var bitis = System.nanoTime();
        System.out.println((bitis-baslangic) +" nanosaniye sürdü");
    }
}
