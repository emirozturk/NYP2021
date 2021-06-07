package com.emirozturk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Kisi{
    private String isim;
    private int yas;
    public Kisi(String isim,int yas) {
        this.isim = isim;
        this.yas = yas;
    }
    @Override
    public String toString(){
        return "%s-%d".formatted(isim, yas);
    }

    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }
}

public class Main {

    public static List<String> metot1(List<String> liste){
        /*
        Liste içerisindeki 50den büyük sayıların 5. elemandan 10. elemana kadar olanlarını alan ve bu sayıların karelerini
        küçükten büyüğe sıralayıp bir string dizisi olarak döndüren metot
         */
        var ellidenBuyukler = new ArrayList<Integer>();//yeni bir liste aç ellidenbuyukler
        for(var eleman:liste) {//döngü içerisinde
            int e = Integer.parseInt(eleman); //her eleman 50den büyük mü diye kontrol et
            if(e>50)//eğer 50den büyükse
                ellidenBuyukler.add(e); //listeye ekle
        }
        var sonucListesi = new ArrayList<Integer>();//sonuclistesi oluştur
        for(int i=4;i<10;i++) { //for döngünüsünü 4. elemandan 10. elemana kadar
            int kare = ellidenBuyukler.get(i)*ellidenBuyukler.get(i); //her elemanın karesini al
            sonucListesi.add(kare); //sonuclistesine ekle
        }
        //sonuc listesini sırala
        for(int i=0;i<sonucListesi.size();i++)
            for(int j=0;j<sonucListesi.size();j++)
                if(sonucListesi.get(i)>sonucListesi.get(j))
                {
                    int temp = sonucListesi.get(i);
                    sonucListesi.set(i,sonucListesi.get(j));
                    sonucListesi.set(j,temp);
                }
        var stringListesi = new ArrayList<String>();//son bir string listesi aç
        for(var eleman:sonucListesi)//bir döngü ile her elemanı string'e dönüştür
            stringListesi.add(eleman.toString());
        return stringListesi;
    }
    List<String> metot2(List<String> liste){
        /*
        Liste içerisindeki 50den büyük sayıların 5. elemandan 10. elemana kadar olanlarını alan ve bu sayıların karelerini
        küçükten büyüğe sıralayıp bir string dizisi olarak döndüren metot
         */
        return liste.stream()
                .map(Integer::parseInt)
                .filter(x->x>50)
                .skip(1)
                .limit(4)
                .map(x->x*x)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) throws IOException {
        /*
        Liste içerisindeki 50den büyük sayıların 5. elemandan 10. elemana kadar olanlarını alan ve bu sayıların karelerini
        küçükten büyüğe sıralayıp bir string dizisi olarak döndüren metot
         */

        //Dosyadan sayıları bir liste içerisine oku
        var liste = Files.readAllLines(Path.of("/Users/emirozturk/Desktop/sayilar.txt"));
        System.out.println(liste);
        var sonucListesi = metot1(liste);

        /*
        var kisiListesi = new ArrayList<Kisi>();
        var satirlar = Files.readAllLines(Path.of("/Users/emirozturk/Desktop/isimler.txt"));
        for(var satir:satirlar){
            var parcalar = satir.split("-");
            kisiListesi.add(new Kisi(parcalar[0],Integer.parseInt(parcalar[1])));
        }
        kisiListesi.forEach(System.out::println);

        System.out.println("--------");

        var sonuc = kisiListesi.stream().filter(x->x.getYas()<30).skip(5).limit(5).collect(Collectors.toList());
        sonuc.forEach(System.out::println);

        /*
        var satirlar = Files.readAllLines(Path.of("/Users/emirozturk/Desktop/sayilar.txt"));
        var intListesi = new ArrayList<Integer>();
        for(var eleman:satirlar)
            intListesi.add(Integer.parseInt(eleman));

        intListesi.forEach(System.out::println);
       var intListesi = satirlar.stream().mapToInt(Integer::parseInt).map(x->x).collect(Collectors.toList());
        */

    }
}
