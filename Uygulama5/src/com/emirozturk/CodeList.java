package com.emirozturk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CodeList {
    List<Integer> codes;
    private CodeList(List<Integer> liste){
        codes = liste;
    }
    CodeList fromBinary(String dosyaYolu){
        return null;
        /*Haftaya devam edilecek
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
        */
    }
    static CodeList fromText(String dosyaYolu) throws IOException {
         var satirlar = Files.readAllLines(Path.of(dosyaYolu));
         List<Integer> liste = new ArrayList<>();
            for(var satir:satirlar)
                liste.add(Integer.parseInt(satir));
        return new CodeList(liste);
    }
    public String toString() {
        StringBuilder degisken = new StringBuilder();
        for(var eleman:codes)
            degisken.append(eleman.toString()).append("\n");
        return degisken.toString();
    }
}
