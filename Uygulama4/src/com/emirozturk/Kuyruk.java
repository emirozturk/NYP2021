package com.emirozturk;

import java.util.ArrayList;
import java.util.List;

public class Kuyruk {
    List<Integer> liste;
    public Kuyruk(){
        liste=new ArrayList<>();
    }
    public boolean ekle(int yeniEleman){
        liste.add(yeniEleman);
        return true;
    }
    public int sil(){
        if(liste.size()>0) {
            int deger = liste.get(0);
            liste.remove(liste.get(0));
            return deger;
        }
        return -1;
    }
}
