package com.emirozturk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

enum Type{Binary,Text}
public class CodeList {
    List<Integer> codes;
    public CodeList(String dosyaYolu,Type tur) throws IOException {
        codes = new ArrayList<>();
        if(tur == Type.Binary){
            //BU KISMIN BİLİNMESİNE GEREK YOK
            var bytes = Files.readAllBytes(Path.of(dosyaYolu));
            var intBuffer = ByteBuffer.wrap(bytes).asIntBuffer();
            int[] dizi =new int[intBuffer.remaining()];
            intBuffer.get(dizi);
            //
            for(var eleman:dizi)
                codes.add(eleman);
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
