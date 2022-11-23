package paradygmatyProgramowaniaObiektowego;

public class OsobaPoli {
    private Zwierze zwierze;

    public void przygarnijZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }

    public void jakNazywaSieTwojeZwierzatko() {
        if (zwierze != null) {
            zwierze.przedstawSie();
        } else {
            System.out.println("Nie mam jeszcze zwierzątka :(");
        }
    }
}
