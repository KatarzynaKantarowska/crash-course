package klasyAbstrakcyjneInterfejsy;

public class InterfejsMain {
    public static void main(String[] args) {
        // ang. interface

        Ryba ryba = new Ryba();
        Ptaki ptak = new Ptaki();
        SsakInterfejsowy ssakInterfejsowy = new SsakInterfejsowy();

        System.out.println("ryba");
        System.out.println();
        ryba.oddychanie();
        ryba.odzywianie();
        ryba.wydawaniePokolenia();

        System.out.println();
        System.out.println("ptak");
        System.out.println();
        ptak.oddychanie();
        ptak.odzywianie();
        ptak.wydawaniePokolenia();

        System.out.println();
        System.out.println("ssak");
        System.out.println();
        ssakInterfejsowy.oddychanie();
        ssakInterfejsowy.odzywianie();
        ssakInterfejsowy.wydawaniePokolenia();
    }
}
