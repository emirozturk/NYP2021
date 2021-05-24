package com.emirozturk;

import java.util.ArrayList;
import java.util.List;

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
class Liste{
    private List<Integer> elemanlar;
    Liste(int ... parametreler){
        elemanlar = new ArrayList<>();
        for(var parametre:parametreler)
            elemanlar.add(parametre);
    }
    int topla(){
        int toplam=0;
        for(int i=0;i<elemanlar.size();i++)
            toplam+=elemanlar.get(i);
        return toplam;
    }
    float topla(){

    }
}
class Main{
    public static void main(String[] args) {
        var liste = new Liste(1.2,7.3,654.2);
        System.out.println(liste.topla());
    }
}