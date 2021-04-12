package com.emirozturk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CodeList {
    List<Integer> codes;
    private CodeList(List<Integer> liste){
        codes = liste;
    }
    public static CodeList fromBinary(String dosyaYolu) throws IOException{
            //BU KISMIN BİLİNMESİNE GEREK YOK
            var bytelar = Files.readAllBytes(Path.of(dosyaYolu));
            var intBuffer = ByteBuffer.wrap(bytelar).asIntBuffer();
            var elemanSayisi = intBuffer.remaining();
            int[] dizi =new int[elemanSayisi];
            intBuffer.get(dizi);
            List<Integer> liste = new ArrayList<>();
            for(var eleman:dizi)
                liste.add(eleman);
            return new CodeList(liste);
    }
    static CodeList fromText(String dosyaYolu) throws IOException {
        /*
        var satirlar = Files.readAllLines(Path.of(dosyaYolu));
         List<Integer> liste = new ArrayList<>();
            for(var satir:satirlar)
                liste.add(Integer.parseInt(satir));
        return new CodeList(liste);

        var satirlar = Files.readAllLines(Path.of(dosyaYolu));
        var akis = satirlar.stream();
        var intAkis = akis.map(Integer::parseInt);
        var liste = intAkis.collect(Collectors.toList());
        return new CodeList(liste);
        */
        return new CodeList(Files.readAllLines(Path.of(dosyaYolu)).stream().map(Integer::parseInt).collect(Collectors.toList()));
    }
    public String toString() {
        StringBuilder degisken = new StringBuilder();
        for(var eleman:codes)
            degisken.append(eleman.toString()).append("\n");
        return degisken.toString();
    }
}
