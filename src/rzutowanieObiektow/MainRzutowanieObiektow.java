package rzutowanieObiektow;

public class MainRzutowanieObiektow {
    public static void main(String[] args) {
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaRozszerzona.ustawLiczba(999);
        klasaRozszerzona.wyswietlLiczbe();

        KlasaPodstawowa klasaPodstawowa = (KlasaPodstawowa) klasaRozszerzona;
        klasaPodstawowa.wyswietlLiczbe();

        Object object = klasaRozszerzona;

    }
}
