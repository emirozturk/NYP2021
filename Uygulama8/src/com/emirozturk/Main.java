package com.emirozturk;
//Aynısı statik sınıflar için de yapılabilir
class Islem{
    int maksimum(int a,int b,int c){
        int enBuyuk = a;
        if(b>enBuyuk)enBuyuk = b;
        if(c>enBuyuk)enBuyuk = c;
        return enBuyuk;
    }
    float maksimum(float a,float b){
        return a>b?a:b;
    }
}
class Main{
    public static void main(String[] args) {
        var islem = new Islem();
        float enBuyuk = islem.maksimum(13.7f,26.2f);
        var ikinci = islem.maksimum(1,5,456);
        System.out.println(enBuyuk);
    }
}