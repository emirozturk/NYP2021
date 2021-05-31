import java.awt.*;
interface IHesaplanabilir{
    double alanHesapla();
}
abstract class Sekil implements IHesaplanabilir{
    private int kenarKalinligi;
    private Color arkaplanRengi;
    private Color cerceveRengi;
}
class Dortgen extends Sekil{
    public double alanHesapla(){
        return 0.0;
    }
    public Color getCerceveRengi(){
        return cerceveRengi;
    }
}
class Kare extends Dortgen{

}
class Daire extends Sekil{
    public double alanHesapla(){
        return 0.0;
    }
}
public class Main {
    public static void main(String[] args) {
        //Sekil s = new Sekil(); //Abstract sınıflardan örnek alınamaz
    }
}
