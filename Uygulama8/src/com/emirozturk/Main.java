package com.emirozturk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
//Aynısı statik sınıflar için de yapılabilir
class Islem{
    static int maksimum(int a,int b,int c){
        int enBuyuk = a;
        if(b>enBuyuk)enBuyuk = b;
        if(c>enBuyuk)enBuyuk = c;
        return enBuyuk;
    }
    static float maksimum(float a,float b){
        return a>b?a:b;
    }
}
*/
/*
interface Arayuz{
    int maksimum(int a,int b);
}
class UstSinif implements Arayuz{
    public int maksimum(int a, int b) {
        System.out.println("Ust Sinif Maksimum bulma işlemini başarıyla tamamladı");
        return a>b?a:b;
    }
}
class AltSinif extends UstSinif{
    @Override
    public int maksimum(int a,int b){
        System.out.println("Alt Sinif Maksimum bulma işlemini başarıyla tamamladı");
        return a>b?a:b;
    }
    @Override
    public String toString(){
        return "x";
    }
}
 */
class Liste<T>{
    private List<T> elemanlar;
    @SafeVarargs
    Liste(T ... parametreler){
        elemanlar = new ArrayList<>();
        Collections.addAll(elemanlar, parametreler);
    }
    T ilkEleman(){
        return elemanlar.get(0);
    }
    T rastgeleElemanAl(){
        int index = new Random().nextInt(elemanlar.size());
        return elemanlar.get(index);
    }
    //SORUNLU
    /*
    double topla(){
        double toplam =0;
        for(var eleman:elemanlar){
            if(eleman instanceof Double)
                toplam += (double)eleman;
            else if(eleman instanceof Integer)
                toplam += (int)eleman;
            else
                toplam = -1;
        }
        return toplam;
    }
     */
    //SORUNLU
}
class KendiSinifim{

}
class Main{
    public static void main(String[] args) {
        var liste = new Liste<Double>(1.2,7.3,654.2,33.6);
        var ikinciListe = new Liste<Integer>(123,45,67,68,3,34,2,34,23,7,5,64);
        var ucuncuListe = new Liste<String>("asd","deneme","değer","aaaa");
        var dorduncuListe = new Liste<KendiSinifim>(new KendiSinifim(),new KendiSinifim());
        System.out.println(liste.ilkEleman());
        System.out.println(ikinciListe.ilkEleman());
        System.out.println(ucuncuListe.ilkEleman());
        System.out.println(liste.rastgeleElemanAl());
        /*
        System.out.println(liste.topla());
        System.out.println(ikinciListe.topla());
        System.out.println(ucuncuListe.topla());
        System.out.println(dorduncuListe.topla());
        */
    }
}