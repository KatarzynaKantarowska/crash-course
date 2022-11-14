package pola;

public class KlasaZPolami {
    int liczbaCalkowita;

    void zwrocWartoscPola() {
        System.out.println("Zwrócona wartość pola: " + liczbaCalkowita);
    }

    void ustawWartośćPola(int wartosc) {
        liczbaCalkowita = wartosc;
    }

    int zwrocWartoscPolaZMetody(){
        return liczbaCalkowita;
    }
}
