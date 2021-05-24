package com.emirozturk;
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
class Main{
    public static void main(String[] args) {
        var degisken = new AltSinif();
        System.out.println(degisken.maksimum(932,2345));
    }
}