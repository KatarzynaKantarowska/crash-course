package klasy.zadanie1;

public class Programista {
   private  String imie;
   private String nazwisko;
   private String jezyk;
   private double zarobki;


    public Programista(String podajImie, String podajNazwisko, String podajJezyk, double podajZarobki) {
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;

    }


    public String pobierzImie() {
        return imie;
    }

   public String pobierzNazwisko() {
        return nazwisko;
    }

    public String pobierzJezyk () {
        return jezyk;
    }
    public double pobierzZarobki() {
        return zarobki;
    }
}
