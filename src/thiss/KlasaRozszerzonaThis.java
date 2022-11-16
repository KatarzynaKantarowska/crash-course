package thiss;

public class KlasaRozszerzonaThis extends KlasaPodstawowaThis {

    int x;
    int y;

    KlasaRozszerzonaThis () {
        System.out.println("Konstruktor z klasa rozszerzona");
    }

    KlasaRozszerzonaThis(int a) {
        x = a;
        System.out.println("Konstruktor z klasa rozszerzona z parametrem: " + a);
    }

    KlasaRozszerzonaThis(int a, int b) {
        this(a);
        y = b;
        System.out.println("Konstruktor z klasa rozszerzona z parametrami: " + a + " " + b);
    }

    void metodaZTejKlasy(){

    }
}
