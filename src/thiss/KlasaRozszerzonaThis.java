package thiss;

public class KlasaRozszerzonaThis extends KlasaPodstawowaThis {

    int x;
    int y;
    int z;
    int v;
    int pole;

    KlasaRozszerzonaThis () {
        System.out.println("Konstruktor z klasa rozszerzona");
    }

    KlasaRozszerzonaThis(int x) {
        this.x = x;
        System.out.println("Konstruktor z klasa rozszerzona z parametrem: " + x);
    }

    KlasaRozszerzonaThis(int x, int y) {
        this(x);
        this.y = y;
        System.out.println("Konstruktor z klasa rozszerzona z parametrami: " + x + " " + y);
    }

    void metodaZTejKlasy(){

    }

    void metodaZParametrami (int pole){
        this.pole = pole;
    }
}
