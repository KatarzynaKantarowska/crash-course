package metody;

public class KlasaDlaMetod {

    // typZwracany nazwaMetody (parametry) {
    // }

    void metodaKtoraNicNieZwraca() {
        System.out.println("Wartość wypisana z metody");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak) {
        liczba++;
        System.out.println("Wartość z metody " + liczba + " " + pojedynczyZnak);
    }

    void nazewnictwoDowolneAleKolejnaMetoda(boolean czyPokazac, int liczba) {
        if (czyPokazac) {
            System.out.println("Liczba: " + liczba);
        } else {
            System.out.println("Nie można pokazać");
        }

    }

    int dodawanie(int a, int b) {
        int wynik = a + b;
        System.out.println("Dodawanie: " + wynik);
        return wynik;
    }

    double dodajCosPoPrzecinku(double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }

    boolean zamienWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
    }

    int zwrocOdWartosciLogicznej(boolean czyZwrocic, int liczba) {
        if (czyZwrocic) {
            return liczba;
        } else {
            return 0;
        }

    }

    int przykladKolejnej() {
        System.out.println("Coś przed zwróceniem");
        return 100;
    }
    void voidKtoryMialbCosZwracac (boolean czyZakonczyc) {
        if (czyZakonczyc) {
            return;
        }
        System.out.println("Coś napisane, bo nie zakończone wartością logiczną");
    }
}
