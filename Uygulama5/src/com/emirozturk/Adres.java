package com.emirozturk;

public class Adres {
    private final String il;
    private final String ilce;
    private final String mahalle;
    private final String sokak;
    private final String apartman;
    private final String postaKodu;

    public Adres(String il, String ilce, String mahalle, String sokak, String apartman, String postaKodu) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.sokak = sokak;
        this.apartman = apartman;
        this.postaKodu = postaKodu;
    }

    public String toString() {
        return "%s %s %s %s %s/%s".formatted(mahalle, sokak, apartman, postaKodu, ilce, il);
    }
}
