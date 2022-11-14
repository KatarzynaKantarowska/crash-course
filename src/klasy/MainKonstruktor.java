package klasy;

public class MainKonstruktor {
    public static void main(String[] args) {
        //ang. constructor

        KlasaKonstruktor klasaKonstruktor = new KlasaKonstruktor(105);

        System.out.println(klasaKonstruktor.pierwszePole);
        System.out.println(klasaKonstruktor.drugiePole);

        KlasaDwa klasaDwa = new KlasaDwa();

        KlasaKonstruktor klasaKon = new KlasaKonstruktor();
        System.out.println(klasaKon.pierwszePole);
        System.out.println(klasaKon.drugiePole);
    }
}
