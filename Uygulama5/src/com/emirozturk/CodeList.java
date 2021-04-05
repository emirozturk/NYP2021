package com.emirozturk;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

enum Type{Binary,Text}
public class CodeList {
    List<Integer> codes;
    public CodeList(String dosyaYolu,Type tur){
        if(tur == Type.Binary){

        }
        else if(tur == Type.Text){
            var satirlar = Files.readAllLines(Path.of(dosyaYolu));
            for(var satir:satirlar){
                int deger = Integer.parseInt(satir);
                codes.add(deger);
            }
        }
    }

    public String toString() {
        StringBuilder degisken = new StringBuilder();
        for(var eleman:codes)
            degisken.append(eleman.toString()).append("\n");
        return degisken.toString();
    }
}
