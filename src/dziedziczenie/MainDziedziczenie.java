package dziedziczenie;

public class MainDziedziczenie {
    public static void main(String[] args) {
        // ang. inheritance

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metodaPierwsza();
        klasaRozszerzona.metodaPierwsza();
        klasaRozszerzona.metodaRozszerzona();

        KlasaBardziejRozszerzona klasaBardziejRozszerzona = new KlasaBardziejRozszerzona();
        klasaBardziejRozszerzona.metodaPierwsza();
        klasaBardziejRozszerzona.metodaDruga();
        klasaBardziejRozszerzona.metodaRozszerzona();

    }
}
