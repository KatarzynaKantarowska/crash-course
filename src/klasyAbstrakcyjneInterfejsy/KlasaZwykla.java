package klasyAbstrakcyjneInterfejsy;

public class KlasaZwykla extends PrzykladowaKlasaAbstrakcjna{
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wypisałam z klasy zwykłej");
    }

    @Override
    public int metodaZParametrem(String z) {
        System.out.println("Wypisuje parametr: " + z);
        return 5;
    }
}
