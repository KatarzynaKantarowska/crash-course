package com.nazwa.app.jeden;

public class KlasaA {
    public int polePubliczne; // dostępny wszędzie. we wszystkich klasach
    protected int poleDziedziczenie; // dostępny w dziedziczeniu oraz w tym samym package'u
    private int polePrywatne; // dostępne tylko w obrębie klasy
    int poleBezNiczego; // package - dostępny w cały, paskage'u

    public void metodaPubliczna() {

    }

    protected void metodaProtected() {

    }
    private void metodaPrywatna() {

    }

    void metodaBezNiczego() {

    }

}
