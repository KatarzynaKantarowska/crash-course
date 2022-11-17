package rzutowanieObiektow;

public class KlasaPodstawowa {
    private  int liczba;
    public  void ustawLiczba(int liczba) {
        this.liczba = liczba;
    }
    public void wyswietlLiczbe(){
        System.out.println("Liczba: " + liczba);
    }
}
