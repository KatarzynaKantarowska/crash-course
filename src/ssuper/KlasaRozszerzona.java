package ssuper;

public class KlasaRozszerzona extends KlasaPodstawowa{

    @Override
    void metoda() {
        super.metoda();
        System.out.println("Kolejny tekst czy operacja w klasie rozszerzonej");
    }
}
