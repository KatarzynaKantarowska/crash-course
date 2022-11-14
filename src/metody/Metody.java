package metody;

public class Metody {
    public static void main(String[] args) {
        // ang. methods
        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'b');
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(true, 100);

        int wynikDodawanie = nazwaObiektu.dodawanie (10, 5);
        System.out.println("Wynik Dodawanie: " + wynikDodawanie);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(10.1);
        System.out.println("po przecinku: " + wynikKolejnejMetody);

        nazwaObiektu.zamienWartoscLogiczna(true);
        System.out.println("wartość logiczna: " + nazwaObiektu.zamienWartoscLogiczna(true));

        nazwaObiektu.voidKtoryMialbCosZwracac(false);
    }
}
