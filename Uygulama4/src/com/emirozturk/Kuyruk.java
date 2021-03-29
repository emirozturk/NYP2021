package com.emirozturk;

public class Kuyruk {
    private int[] dizi;
    private int elemanSayisi;
    public Kuyruk(){
        dizi = new int[10];
        elemanSayisi = 0;
    }
    //0 0 0 0 0 0 0 0 0 0
    //^
    //5 0 0 0 0 0 0 0 0 0
    //  ^
    //5 8 0 0 0 0 0 0 0 0
    //    ^
    public boolean ekle(int yeniEleman){
        if(elemanSayisi<10){
            dizi[elemanSayisi]=yeniEleman;
            elemanSayisi++;
            return true;
        }
        return false;
    }
    //5 8 0 0 0 0 0 0 0 0
    //    ^
    //8 0 0 0 0 0 0 0 0 0
    //  ^
    public int sil(){
        if(elemanSayisi>0){
            int degisken = dizi[0];
            for(int i=1;i<elemanSayisi;i++)
                dizi[i-1]=dizi[i];
            elemanSayisi--;
            return degisken;
        }
        return -1;
    }
}
