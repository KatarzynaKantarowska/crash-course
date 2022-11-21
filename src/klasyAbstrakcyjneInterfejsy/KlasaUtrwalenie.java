package klasyAbstrakcyjneInterfejsy;

public
class KlasaUtrwalenie extends KlasaAbstrakcyjnaUtrwalenie implements InterfejsUtrwalenie, DrugiInterfejsUtrwalenie {
    private int pole;

    public void metodaKlasaUtrwalenie(String anonimowa_metoda_klasa) {
        System.out.println("Wykonuje czynności w klasie");
    }

    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Własna obsługa metody abstrakcyjnej w klasie");
    }

    @Override
    public int metodaInterfejsu() {
        System.out.println("Zaimplementowałam metodę z interfejsu w klasie");
        return 0;
    }

    @Override
    public int metodaZDrugiegoInterfejsu() {
        return 101;
    }

    @Override
    public String kolejnaMetodaZInterfejsuDrugiego() {
        return "Zwracam tekst, bo mi tak kazano";
    }
}
