package paradygmatyProgramowaniaObiektowego;

public class MainPolimorfizm {
    public static void main(String[] args) {
        OsobaPoli osobaPoli = new OsobaPoli();
        Pies pies = new Pies("Reksio");
        Kon kon = new Kon("Mustang");

        osobaPoli.przygarnijZwierze(pies);
        osobaPoli.jakNazywaSieTwojeZwierzatko();

    }
}
