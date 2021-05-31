import java.awt.*;

abstract class Sekil{
    private int kenarKalinligi;
    private Color arkaplanRengi;
    private Color cerceveRengi;
    public Color getCerceveRengi(){
        return cerceveRengi;
    }
    double alanHesapla(){
        System.out.println("Dortgen Alanı hesabı");
        return 0;
    }
}
class Dortgen extends Sekil{

}
class Kare extends Dortgen{

}
class Daire extends Sekil{
    @Override
    public double alanHesapla(){
        System.out.println("Daire Alanı hesabı");
        return 0.0;
    }
}
public class Main {
    public static void main(String[] args) {
        //Sekil s = new Sekil(); //Abstract sınıflardan örnek alınamaz
        var yeniDortgen = new Dortgen();
        var yeniKare = new Kare();
        var yeniDaire = new Daire();
        System.out.println(yeniDortgen.alanHesapla());
        System.out.println(yeniKare.alanHesapla());
        System.out.println(yeniDaire.alanHesapla());
    }
}
