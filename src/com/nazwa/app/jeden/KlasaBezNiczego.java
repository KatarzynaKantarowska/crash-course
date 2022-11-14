package com.nazwa.app.jeden;

public class KlasaBezNiczego {
    public void metoda(){
        KlasaA obiekt = new KlasaA();
        obiekt.poleDziedziczenie = 202;
        obiekt.poleBezNiczego = 505;
        obiekt.metodaPubliczna();
        obiekt.metodaBezNiczego();
        obiekt.metodaProtected();
    }
}
