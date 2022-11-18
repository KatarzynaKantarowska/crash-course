package klasyAbstrakcyjneInterfejsy;

public class KlasaAbstrakcyjnaMain {
    public static void main(String[] args) {
        // ang. abstract class
        KlasaZwykla obiekt = new KlasaZwykla();
        obiekt.metodaAbstrakcyjna();
        obiekt.metodaZParametrem("Hej");
        obiekt.jakasMetoda();

        Pies pies = new Pies();
        Kot kot = new Kot();
        Kon kon = new Kon();

        System.out.println("Dla psa");

        System.out.println();
        pies.przemieszczanieSie();
        pies.wydajDzwiek();
        pies.karmieniePotomstwa();
        pies.podajIloscKonczyn();
        pies.temperaturaCiala();
        System.out.println();

        System.out.println("Dla kota");

        System.out.println();
        kot.przemieszczanieSie();
        kot.wydajDzwiek();
        kot.karmieniePotomstwa();
        kot.podajIloscKonczyn();
        kot.temperaturaCiala();
        System.out.println();

        System.out.println("Dla konia");

        System.out.println();
        kon.przemieszczanieSie();
        kon.wydajDzwiek();
        kon.karmieniePotomstwa();
        kon.podajIloscKonczyn();
        kon.temperaturaCiala();
    }
}
