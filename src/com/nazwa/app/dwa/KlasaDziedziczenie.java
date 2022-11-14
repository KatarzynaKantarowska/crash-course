package com.nazwa.app.dwa;

import com.nazwa.app.jeden.KlasaA;

public class KlasaDziedziczenie extends KlasaA {
    public void metoda() {
        polePubliczne = 101;
        poleDziedziczenie = 102;
        metodaPubliczna();
        metodaProtected();
    }
}
