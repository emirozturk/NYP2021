package com.emirozturk;

import java.io.IOException;
import java.util.logging.Logger;

public class Main {

    /*
    public static void main(String[] args) {
        Adres adres = new Adres("Edirne","Merkez","Şükrüpaşa","Latife Hanım","Apt","22030");
        Kart kart = new Kart("1111-1111-1111-1111",(byte)9,(byte)10,(byte)123);
        var yeniKisi = new Kisi("Emir Öztürk",1933,adres,kart);
        System.out.println(yeniKisi);
    }
    */
    public static void main(String[] args) {
        try {
            var liste1 = CodeList.fromText("/Users/emirozturk/Desktop/Codes.txt");
            System.out.println(liste1);
            var liste2 = CodeList.fromBinary("/Users/emirozturk/Desktop/Codes.bin");
            System.out.println(liste2);
            //var liste2 = new CodeList("/Users/emirozturk/Desktop/Codes.bin", Type.Binary);
            //System.out.println(liste2);
        }catch(IOException ex){
            Logger.getLogger(Main.class.getName()).info(ex.getMessage());
        }
    }
}
