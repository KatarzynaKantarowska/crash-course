package zadanie_dziedziczenie;

public class Pracownik extends Osoba {

    protected String stanowisko;
    protected String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;

    }

    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.println(" i pracuję w fimie "+ nazwaFirmy + " na stanowisku " + stanowisko);
    }
}
